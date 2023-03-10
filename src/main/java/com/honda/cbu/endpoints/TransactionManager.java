package com.honda.cbu.endpoints;

import javax.enterprise.context.ApplicationScoped;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.cdi.ContextName;
import org.apache.camel.component.properties.PropertiesComponent;
import org.apache.camel.model.dataformat.JsonLibrary;

import com.honda.cbu.models.WMSRespuesta;

@ApplicationScoped
@ContextName("camel-eap-context-cbuwmstraxmgr")
public class TransactionManager extends RouteBuilder
{
	
	
	@Override
	public void configure() throws Exception {
		
		PropertiesComponent pc = new PropertiesComponent();
		pc.setLocation("classpath:com/honda/ms/properties/service.properties");
		getContext().addComponent("properties", pc);
		getContext().setStreamCaching(true);
		
		restConfiguration()
        .component("undertow")
        .contextPath("api");
		
		//from("jt400://BPCSSECOFT:BPCSTEST@207.130.116.47/QSYS.LIB/C82BPCSUSF.LIB/DQBPCSESB.DTAQ")
		rest("/wms-trxmgr/")
		.post()
		.produces("application/json")
		.to("direct:splitter");
		
		from("direct:splitter")
			.streamCaching()
			
			.setProperty("nameOp",simple("${body}"))
			.log("${property.nameOp}")
			
			//enviamos a la ruta encargada de hacer la transaccion
			.choice()
				.when(simple("${property.nameOp} == 'ORDERSHIPPED'"))
					.log("Dirigièndose a: WMS de Shipment Confirmation")
					.setProperty("msj-log",constant("Dirigiendose a: CBU Shipment Confirmation"))
					.setProperty("url-wms",constant("{{url.wms.shipment-confirmation}}"))
					.setProperty("url-ms",constant("{{url.shipment-confirmation}}"))
					.to("direct:consultaWMS")
					//.endChoice()
				.when(simple("${property.nameOp} == 'ASNVERIFIED'"))
					.log("Dirigièndose a: WMS de Inventory Update")
					.setProperty("msj-log",constant("Dirigiendose a: CBU Inventory Update"))
					.setProperty("url-wms",constant("{{url.wms.inventory-update}}"))
					.setProperty("url-ms",constant("{{url.inventory-update}}"))
					.to("direct:consultaWMS")
					//.endChoice()
				.when(simple("${property.nameOp} == 'ADJUSTMENT'"))
					.log("Dirigièndose a: WMS de Inventory Adjustment")
					.setProperty("msj-log",constant("Dirigiendose a: CBU Inventory Adjustment"))
					.setProperty("url-wms",constant("{{url.wms.inventory-adjustment}}"))
					.setProperty("url-ms",constant("{{url.inventory-adjustment}}"))
					.to("direct:consultaWMS")
					//.endChoice()
				.otherwise()
					.log("No se recibió un mensaje esperado. En cambio, se recibió: ${body}")
					//.endChoice()
			.endChoice()
			
		.end();
		
		from("direct:consultaWMS")
			.setBody(constant(""))
			.setProperty("warehouse",simple("{{wms.param.warehouse}}"))
			.log("${property.warehouse}")
			.log("${property.url-wms}")
			
			.setHeader(Exchange.HTTP_METHOD,constant(org.apache.camel.component.http.HttpMethods.POST))
			.setHeader("Username",simple("{{wms.header.username}}"))
			.setHeader("Password",simple("{{wms.header.password}}"))
			.setHeader("Tenant",simple("{{wms.header.tenant}}"))
			.setBody(simple("${property.nameOp}"))
			
			.toD("${property.url-wms}")
			
			.setProperty("jsonWMSRespuesta", simple("${body}"))
			.log("${property.jsonWMSRespuesta}")
			
			.unmarshal().json(JsonLibrary.Jackson, WMSRespuesta.class)
			
			.choice()
				.when(simple("${body.jsonMessage} != null"))
					.log("${property.msj-log}")
					.setBody(simple("${body.jsonMessage}"))
					.setHeader(Exchange.HTTP_METHOD,constant(org.apache.camel.component.http.HttpMethods.POST))
					.setProperty("url-ms-final",simple("${property.url-ms}?{{url.parameters}}"))
					.toD("${property.url-ms-final}")
					.log("Regreso al Transaction Manager. Fin.")
					.endChoice()
				.otherwise()
					.log("La respuesta de WMS no contiene la  propiedad jsonMessage")
					.endChoice()
			.end()
			.setBody(constant(""))
		.end();
      
	}
    
}

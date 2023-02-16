package com.honda.test;

import org.apache.camel.CamelContext;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

public class InvocationTest extends CamelTestSupport{
	
	@Override
	protected CamelContext createCamelContext() throws Exception {
		CamelContext camelCtx = super.createCamelContext();
		return camelCtx;
		
	}

	@Test
    public void invocate(){
		
		try {
			//context.start();
			String mensaje = "0002000000000010CBUSAVEITEM NORMAL 00022022-05-24 17:22:39:121CBF125-N-NE";
			
			getMockEndpoint("mock:direct:splitter")
			.expectedBodyReceived();
			
			final String RESPONSE = template.requestBody("direct:splitter",mensaje,String.class);
			
			System.out.println(RESPONSE);
			
			assertEquals(RESPONSE,"Mensaje Recibido");
			//context.stop();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	 
}

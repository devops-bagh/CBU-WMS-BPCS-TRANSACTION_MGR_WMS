package com.honda.cbu.models;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WMSRespuesta {
	
	@JsonProperty("fieldOverrides")
	private FieldOverrides fieldOverrides;
	
	@JsonProperty("hrefs")
	private Hrefs hrefs;
	
	@JsonProperty("transmitlogkey")
	private String transmitLogKey;
	
	@JsonProperty("adddate")
	private String addDate;
	
	@JsonProperty("addwho")
	private String addWho;
	
	@JsonProperty("billingtransmitflag")
	private String billingTransmitFlag;
	
	@JsonProperty("editdate")
	private String editDate;
	
	@JsonProperty("editwho")
	private String editWho;
	
	@JsonProperty("eventcategory")
	private String eventCategory;
	
	@JsonProperty("eventfailurecount")
	private BigDecimal eventFailureCount;
	
	@JsonProperty("eventstatus")
	private BigDecimal eventStatus;
	
	@JsonProperty("key1")
	private String key1;
	
	@JsonProperty("key2")
	private String key2;
	
	@JsonProperty("key3")
	private String key3;
	
	@JsonProperty("key4")
	private String key4;
	
	@JsonProperty("key5")
	private String key5;
	
	@JsonProperty("labortransmitflag")
	private String laborTransmitFlag;
	
	@JsonProperty("message")
	private String message;	
	
	@JsonProperty("serialkey")
	private BigDecimal serialKey;
	
	@JsonProperty("tablename")
	private String tableName;
	
	@JsonProperty("tmTransmitFlag")
	private String tmTransmitFlag;
	
	@JsonProperty("transmitBatch")
	private String transmitBatch;
	
	@JsonProperty("transmitflag")
	private String transmitFlag;
	
	@JsonProperty("transmitflag2")
	private String transmitFlag2;
	
	@JsonProperty("transmitflag3")
	private String transmitFlag3;
	
	@JsonProperty("transmitflag4")
	private String transmitFlag4;
	
	@JsonProperty("transmitflag5")
	private String transmitFlag5;
	
	@JsonProperty("transmitflag6")
	private String transmitFlag6;
	
	@JsonProperty("transmitflag7")
	private String transmitFlag7;
	
	@JsonProperty("transmitflag8")
	private String transmitFlag8;
	
	@JsonProperty("transmitflag9")
	private String transmitFlag9;
	
	@JsonProperty("whseid")
	private String whseid;
	
	@JsonProperty("jsonMessage")
	private String jsonMessage;

	
	public FieldOverrides getFieldOverrides() {
		return fieldOverrides;
	}

	public void setFieldOverrides(FieldOverrides fieldOverrides) {
		this.fieldOverrides = fieldOverrides;
	}

	public Hrefs getHrefs() {
		return hrefs;
	}

	public void setHrefs(Hrefs hrefs) {
		this.hrefs = hrefs;
	}

	public String getTransmitLogKey() {
		return transmitLogKey;
	}

	public void setTransmitLogKey(String transmitLogKey) {
		this.transmitLogKey = transmitLogKey;
	}

	public String getAddDate() {
		return addDate;
	}

	public void setAddDate(String addDate) {
		this.addDate = addDate;
	}

	public String getAddWho() {
		return addWho;
	}

	public void setAddWho(String addWho) {
		this.addWho = addWho;
	}

	public String getBillingTransmitFlag() {
		return billingTransmitFlag;
	}

	public void setBillingTransmitFlag(String billingTransmitFlag) {
		this.billingTransmitFlag = billingTransmitFlag;
	}

	public String getEditDate() {
		return editDate;
	}

	public void setEditDate(String editDate) {
		this.editDate = editDate;
	}

	public String getEditWho() {
		return editWho;
	}

	public void setEditWho(String editWho) {
		this.editWho = editWho;
	}

	public String getEventCategory() {
		return eventCategory;
	}

	public void setEventCategory(String eventCategory) {
		this.eventCategory = eventCategory;
	}

	public BigDecimal getEventFailureCount() {
		return eventFailureCount;
	}

	public void setEventFailureCount(BigDecimal eventFailureCount) {
		this.eventFailureCount = eventFailureCount;
	}

	public BigDecimal getEventStatus() {
		return eventStatus;
	}

	public void setEventStatus(BigDecimal eventStatus) {
		this.eventStatus = eventStatus;
	}

	public String getKey1() {
		return key1;
	}

	public void setKey1(String key1) {
		this.key1 = key1;
	}

	public String getKey2() {
		return key2;
	}

	public void setKey2(String key2) {
		this.key2 = key2;
	}

	public String getKey3() {
		return key3;
	}

	public void setKey3(String key3) {
		this.key3 = key3;
	}

	public String getKey4() {
		return key4;
	}

	public void setKey4(String key4) {
		this.key4 = key4;
	}

	public String getKey5() {
		return key5;
	}

	public void setKey5(String key5) {
		this.key5 = key5;
	}

	public String getLaborTransmitFlag() {
		return laborTransmitFlag;
	}

	public void setLaborTransmitFlag(String laborTransmitFlag) {
		this.laborTransmitFlag = laborTransmitFlag;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public BigDecimal getSerialKey() {
		return serialKey;
	}

	public void setSerialKey(BigDecimal serialKey) {
		this.serialKey = serialKey;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getTmTransmitFlag() {
		return tmTransmitFlag;
	}

	public void setTmTransmitFlag(String tmTransmitFlag) {
		this.tmTransmitFlag = tmTransmitFlag;
	}

	public String getTransmitBatch() {
		return transmitBatch;
	}

	public void setTransmitBatch(String transmitBatch) {
		this.transmitBatch = transmitBatch;
	}

	public String getTransmitFlag() {
		return transmitFlag;
	}

	public void setTransmitFlag(String transmitFlag) {
		this.transmitFlag = transmitFlag;
	}

	public String getTransmitFlag2() {
		return transmitFlag2;
	}

	public void setTransmitFlag2(String transmitFlag2) {
		this.transmitFlag2 = transmitFlag2;
	}

	public String getTransmitFlag3() {
		return transmitFlag3;
	}

	public void setTransmitFlag3(String transmitFlag3) {
		this.transmitFlag3 = transmitFlag3;
	}

	public String getTransmitFlag4() {
		return transmitFlag4;
	}

	public void setTransmitFlag4(String transmitFlag4) {
		this.transmitFlag4 = transmitFlag4;
	}

	public String getTransmitFlag5() {
		return transmitFlag5;
	}

	public void setTransmitFlag5(String transmitFlag5) {
		this.transmitFlag5 = transmitFlag5;
	}

	public String getTransmitFlag6() {
		return transmitFlag6;
	}

	public void setTransmitFlag6(String transmitFlag6) {
		this.transmitFlag6 = transmitFlag6;
	}

	public String getTransmitFlag7() {
		return transmitFlag7;
	}

	public void setTransmitFlag7(String transmitFlag7) {
		this.transmitFlag7 = transmitFlag7;
	}

	public String getTransmitFlag8() {
		return transmitFlag8;
	}

	public void setTransmitFlag8(String transmitFlag8) {
		this.transmitFlag8 = transmitFlag8;
	}

	public String getTransmitFlag9() {
		return transmitFlag9;
	}

	public void setTransmitFlag9(String transmitFlag9) {
		this.transmitFlag9 = transmitFlag9;
	}

	public String getWhseid() {
		return whseid;
	}

	public void setWhseid(String whseid) {
		this.whseid = whseid;
	}

	public String getJsonMessage() {
		return jsonMessage;
	}

	public void setJsonMessage(String jsonMessage) {
		this.jsonMessage = jsonMessage;
	}
}

package com.honda.cbu.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Hrefs {
	
	@JsonProperty("ref")
	private String ref;

	@JsonProperty("url")
	private String url;
	

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}

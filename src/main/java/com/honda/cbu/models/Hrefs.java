package com.honda.cbu.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Hrefs {
	
	@JsonProperty("ref")
	public Hrefs ref;

	@JsonProperty("url")
	public Hrefs url;
	

	public Hrefs getRef() {
		return ref;
	}

	public void setRef(Hrefs ref) {
		this.ref = ref;
	}

	public Hrefs getUrl() {
		return url;
	}

	public void setUrl(Hrefs url) {
		this.url = url;
	}
}

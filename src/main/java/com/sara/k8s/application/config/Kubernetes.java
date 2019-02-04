package com.sara.k8s.application.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("kubernetes")
public class Kubernetes {
	
	private String host;
	
	private String apiPath;
	
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getApiPath() {
		return apiPath;
	}
	public void setApiPath(String apiPath) {
		this.apiPath = apiPath;
	}

}

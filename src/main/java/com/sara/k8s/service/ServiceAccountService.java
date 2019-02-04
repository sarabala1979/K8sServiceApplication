package com.sara.k8s.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sara.k8s.application.config.Kubernetes;

import io.kubernetes.client.proto.V1.ServiceAccountList;

@Service
public class ServiceAccountService {

	@Autowired
	private ExternalClientService externalClientService;
	
//	@Autowired
//	private Kubernetes kubernetes;
//	
	private final String NS_RESOURCE_PATH = "namespaces/{namespace}/serviceaccounts";
	private final String RESOURCE_PATH = "/serviceaccounts";
	
	public ServiceAccountService() {
		
	}
	
	public String getServiceAccounts(String nameSpace) {
		String url = "127.0.0.1:55647/api/v1/namespaces/"+nameSpace+"/serviceaccounts";
		System.out.println(url);
	
		return externalClientService.executeGet(url, null, String.class);
	}
	public String getServiceAccounts() {
		String url = "127.0.0.1:55647/api/v1/serviceaccounts";
		System.out.println(url);
	
		return externalClientService.executeGet(url, null, String.class);
	}

}

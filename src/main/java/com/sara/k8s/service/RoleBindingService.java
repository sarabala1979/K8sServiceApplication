package com.sara.k8s.service;

import org.springframework.beans.factory.annotation.Autowired;

import io.kubernetes.client.models.V1RoleBinding;
import io.kubernetes.client.models.V1RoleList;

@org.springframework.stereotype.Service
public class RoleBindingService {
	
	@Autowired
	private ExternalClientService externalClientService;
	
	private final String NS_RESOURCE_PATH_ROLE = "namespaces/{namespace}/rolebinding";

	
	public String createRoleBinding(V1RoleBinding bind, String nameSpace) {
		
		String url = "127.0.0.1:55647/api/v1/namespaces/"+nameSpace+"/rolebinding";
		return externalClientService.executeGet(url, null, V1RoleList.class);
		
		
	}

}

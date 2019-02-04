package com.sara.k8s.service;

import org.springframework.beans.factory.annotation.Autowired;

import io.kubernetes.client.models.V1ClusterRoleList;
import io.kubernetes.client.models.V1RoleList;

public class RoleService {
	@Autowired
	private ExternalClientService externalClientService;
	
	private final String NS_RESOURCE_PATH_ROLE = "namespaces/{namespace}/roles";
	private final String NS_RESOURCE_PATH_CROLE = "namespaces/{namespace}/clusterroles";

	public String getRoles(String nameSpace) {
		String url = "127.0.0.1:55647/api/v1/namespaces/"+nameSpace+"/roles";
		return externalClientService.executeGet(url, null, V1RoleList.class);
		
	}
	
	public String getClusterRoleList((String nameSpace) {
		String url = "127.0.0.1:55647/api/v1/namespaces/"+nameSpace+"/cluterroles";
		return externalClientService.executeGet(url, null, V1ClusterRoleList.class);
	}

}

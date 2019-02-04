package com.sara.k8s.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.kubernetes.client.models.V1alpha1ClusterRoleList;
import io.kubernetes.client.models.V1alpha1RoleList;

@RestController
public class RoleController extends BaseController{
	
	
	@RequestMapping("/allroles")
	public V1alpha1RoleList getRoles() {
		return null;
	}
	
	@RequestMapping("/allclusterrole")
	private V1alpha1ClusterRoleList getClusterRoleList() {
		return null;
	}

}

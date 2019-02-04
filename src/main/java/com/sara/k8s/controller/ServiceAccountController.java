package com.sara.k8s.controller;
import org.springframework.web.bind.annotation.RestController;

import com.sara.k8s.service.ServiceAccountService;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ServiceAccountController extends BaseController {
	
	@Autowired
	private ServiceAccountService serviceAccountService;

	@RequestMapping("namespace/{namespace}/serviceaccounts")
	public String getNameSpaceServiceAccounts(@PathVariable("namespace") String namespace) {
		
		return serviceAccountService.getServiceAccounts(namespace);
		
	}
	@RequestMapping("/allserviceaccounts")
	public String getNameSpaceServiceAccounts() {
		
		return serviceAccountService.getServiceAccounts();
		
	}	
	
}

package com.sara.k8s.controller;

import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.kubernetes.client.models.V1RoleBinding;
import io.kubernetes.client.models.V1RoleBindingList;

@RestController
public class RoleBinderController extends BaseController {
	
	
	public V1RoleBindingList getRoleBinder() {
		return null;
	}
	
	@RequestMapping(path="/rolebinding", method=RequestMethod.POST)
	public ResponseEntity<String> createRoleBinder(V1RoleBinding roleBinding ) {
	
		return new ResponseEntity<String>("Created Successfully", HttpStatus.CREATED);
	}
	
	@RequestMapping(path="/rolebinding", method=RequestMethod.DELETE)
	public ResponseEntity<String> deleteRoleBinder(V1RoleBinding roleBinding ) {
	
		return new ResponseEntity<String>("Created Successfully", HttpStatus.CREATED);
	}
		

}

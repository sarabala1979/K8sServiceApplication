package com.sara.k8s.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class ExternalClientService {

	
	private String buildURL(String url, MultiValueMap<String, String> queryParams) {
		UriComponents uriComponents = UriComponentsBuilder.newInstance()
	            .scheme("http").host(url)
	            .queryParams(queryParams).build();
		return uriComponents.toUriString();

	}
	
	
	public String executeGet(String url, MultiValueMap<String,String> queryparam, Class outputType) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response
		  = restTemplate.getForEntity(buildURL(url,queryparam), outputType);
//		assertThat(response.getStatusCode().equals(HttpStatus.OK));
		return response.getBody();
	}
	
	public String executePost(String url,  MultiValueMap<String,String> queryparam, String body, Class outputType) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response
		  = restTemplate.postForEntity(buildURL(url,queryparam), body, outputType);

//		assertThat(response.getStatusCode().equals(HttpStatus.OK));
		return response.getBody();
	}
	
	public void executeDelete(String url,  MultiValueMap<String,String> queryparam) {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.delete(url);
	}	
}

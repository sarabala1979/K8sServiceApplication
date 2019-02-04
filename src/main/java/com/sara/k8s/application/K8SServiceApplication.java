package com.sara.k8s.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan(basePackages={" com.sara.k8s.controller", "com.sara.k8s.service", "com.sara.k8s.application.config"})
public class K8SServiceApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(K8SServiceApplication.class, args);

	}

}

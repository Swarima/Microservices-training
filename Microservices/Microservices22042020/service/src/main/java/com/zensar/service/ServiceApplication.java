package com.zensar.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServiceApplication {
	
	@Value("${service.instance.name}")
	private String instanceName;

	public static void main(String[] args) {
		SpringApplication.run(ServiceApplication.class, args);
	}
	
	@RequestMapping("/")
	public String sayHello() {
		return "<h1> Hello from "+instanceName +"</h1>";
	}

}

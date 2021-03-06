package com.fis.eurekaserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteDefinitionLocator;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiGatewayApplication {
	
	@Autowired
	RouteDefinitionLocator locater;
		public static void main(String[] args) {
			SpringApplication.run(ApiGatewayApplication.class, args);
	}

}

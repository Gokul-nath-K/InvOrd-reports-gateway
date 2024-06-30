package com.quinbay.reports_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ReportsGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReportsGatewayApplication.class, args);
	}

}

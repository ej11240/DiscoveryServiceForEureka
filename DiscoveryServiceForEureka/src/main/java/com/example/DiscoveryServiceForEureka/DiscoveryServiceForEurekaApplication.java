package com.example.DiscoveryServiceForEureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServiceForEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServiceForEurekaApplication.class, args);
	}

}

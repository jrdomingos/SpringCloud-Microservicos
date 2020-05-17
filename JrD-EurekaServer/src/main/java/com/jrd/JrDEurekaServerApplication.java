package com.jrd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class JrDEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JrDEurekaServerApplication.class, args);
	}

}

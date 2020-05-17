package com.jrd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class JrDDivServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(JrDDivServiceApplication.class, args);
	}

}

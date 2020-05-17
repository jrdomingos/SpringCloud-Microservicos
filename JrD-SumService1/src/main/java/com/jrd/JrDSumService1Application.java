package com.jrd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class JrDSumService1Application {

	public static void main(String[] args) {
		SpringApplication.run(JrDSumService1Application.class, args);
	}

}

package com.jrd.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SumController {
	
	@Value("${spring.application.name}")
	private String serviceName;
	
	@GetMapping("/sum/{num1}/{num2}")
	public String sum(@PathVariable Double num1, @PathVariable Double num2) {
		Double result = num1 + num2;
		return serviceName + " " + result;
	}

}

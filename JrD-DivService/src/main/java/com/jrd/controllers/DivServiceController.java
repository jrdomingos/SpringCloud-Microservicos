package com.jrd.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DivServiceController {   
	
	@Value("${spring.application.name}")
	private String serviceName;
	
	@GetMapping("/div/{num3}/{num4}")
	public String div(@PathVariable Double num3, @PathVariable Double num4) {
		Double result = num3 / num4;
		return serviceName + " " + result;
	}
	
	
}

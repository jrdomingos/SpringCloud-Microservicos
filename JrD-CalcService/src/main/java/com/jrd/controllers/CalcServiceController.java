package com.jrd.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/")
public class CalcServiceController {

	 @Autowired
	 private RestTemplate restTemplate;
	 
	 @GetMapping("/calc/{num1}/{num2}/{num3}/{num4}")
	 public String calc(@PathVariable Double num1, @PathVariable Double num2, @PathVariable Double num3, @PathVariable Double num4) {
		
		 String sumServiceResult = restTemplate.getForObject("http://sum-service/sum/{num1}/{num2}", String.class, num1, num2);
		 
		 String divServiceResult = restTemplate.getForObject("http://div-service/div/{num3}/{num4}", String.class, num3, num4);
		 
		 Double calcServiceResult = num1 - num2 + num3 / num4;	
		 
		 
		 return "Return from all : " + sumServiceResult + " " + calcServiceResult + " " + divServiceResult;
	 }
	 
	 
}

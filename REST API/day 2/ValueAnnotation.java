package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
	
@RestController
public class ValueAnnotation {
	@Value("${greeting.message}")
	private String message;
	@GetMapping("/message")
	public String handler() {
		return message;
	}

}


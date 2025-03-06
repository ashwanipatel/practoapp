package com.practice.practoapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PractoController {

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello from Spring Boot";
	}
}

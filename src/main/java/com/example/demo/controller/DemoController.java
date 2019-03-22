package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping
	public String helloWorld() {
		return "Prueba despliegue con Java en curso de Azure";
	}

}

package com.example.gitHub.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/home")
	public String home() {
		return "This is home page!!!";
		
	}
	@GetMapping("/home1")
	public String home1() {
		return "This is login branch";
		
	}
	

}

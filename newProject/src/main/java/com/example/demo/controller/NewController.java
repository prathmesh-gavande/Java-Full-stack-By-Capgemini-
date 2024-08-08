package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewController {
	
	@GetMapping("/")
	public String  display() {
		return"Home";
	}
	
	@GetMapping("/first")
	public String displayfirst() {
		return"first";
	}
}

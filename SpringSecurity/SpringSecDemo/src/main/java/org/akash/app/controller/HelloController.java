package org.akash.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HelloController {
	@GetMapping("/hello")
	public String greeting(HttpServletRequest request) {
		return "hello world "+request.getSession().getId();
	}
	
	@GetMapping("/about")
	public String about(HttpServletRequest request) {
		return "Akash "+request.getSession().getId();
	}
}

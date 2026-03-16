package org.akash.app.controller;


import org.akash.app.model.User;
import org.akash.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	private UserService service;
	
	@PostMapping
	public User register(@RequestBody User user) {
		return service.saveUser(user);
	}
}

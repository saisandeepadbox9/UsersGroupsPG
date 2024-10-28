package com.inmem.userGrps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inmem.userGrps.model.User;
import com.inmem.userGrps.service.UserDetailsService;

@RestController
public class UserController {

	private UserDetailsService userService;
	
	@Autowired
	public UserController(UserDetailsService uds) {
		this.userService = uds;
		
		
	}

	@GetMapping("/allUsers")
	public List<User> getAllUsers() {

		return userService.getAllUsers();
	}

	@PostMapping("/register")
	public User registerUser(@RequestBody User user) {
		return userService.create(user);
	}
}

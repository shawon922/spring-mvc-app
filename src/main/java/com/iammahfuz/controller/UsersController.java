package com.iammahfuz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iammahfuz.model.User;
import com.iammahfuz.service.UserService;

@RestController
@RequestMapping("/api")
public class UsersController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<User> users() {
		List<User> users = userService.findAllUsers();
		
		return users;
	}
	
	@GetMapping("/users/{id}")
	public User user(@PathVariable int id) {
		User user = userService.findUserById(id);
		
		return user;
	}
	
}

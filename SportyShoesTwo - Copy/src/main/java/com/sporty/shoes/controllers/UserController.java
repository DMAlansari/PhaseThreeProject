package com.sporty.shoes.controllers;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.sporty.shoes.entities.User;
import com.sporty.shoes.services.UserService;

@RestController
public class UserController {

	@Autowired
	UserService service;
	
	@GetMapping("/users/{id}")
	Optional<User> getUserById(@PathVariable int id) {
		return service.getUserById(id);
	}
	@GetMapping("/users")
	List<User> getAllUsers() {
		return service.getAllUsers();
	}

}

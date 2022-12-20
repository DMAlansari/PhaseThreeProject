package com.sporty.shoes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sporty.shoes.services.AdminService;

@RestController
public class AdminController {
	@Autowired
	AdminService service;
	
	@GetMapping("/admin/login/{password}")
	public String login(@PathVariable String password) {
		return service.login(password);
	}

}

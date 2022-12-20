package com.sporty.shoes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sporty.shoes.dao.PurchasedRepository;


@Service
public class AdminService {
	

	@Autowired
	PurchasedRepository repo;
	
	public String login (String password) {
		if(password.equalsIgnoreCase("1234"))
			return "You are logged in";
		else
			return "Invalid password";
	}
	

}

package com.sporty.shoes.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sporty.shoes.dao.UserRepository;
import com.sporty.shoes.entities.User;



@Service
public class UserService {
	@Autowired
	UserRepository repo;
	
	public Optional<User> getUserById(Integer id) { //to deal with nulls without exceptions
		return repo.findById(id);
	}
	public List<User> getAllUsers() { // list 6uweel
		return (List<User>) repo.findAll();
	}
}

package com.sporty.shoes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sporty.shoes.dao.PurchasedRepository;


@Service
public class PurchasedService {
	@Autowired
	PurchasedRepository repo;
	
	

}

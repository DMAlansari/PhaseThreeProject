package com.sporty.shoes.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sporty.shoes.dao.SneakersRepository;
import com.sporty.shoes.entities.Sneakers;

@Service
public class SneakersService {
	@Autowired
	SneakersRepository repo;
	
	
	public Optional<Sneakers> getSneakersById(Integer id){
		return repo.findById(id);
	}
	
	public Iterable<Sneakers> getAllSneakers() {
		return repo.findAll();
	}
	public void addSneakers(Sneakers sneaker) {
		 repo.save(sneaker);
	}
	
	public Sneakers findByBrand(String brand) {
		return repo.findByBrand(brand);
	}
	
	

}

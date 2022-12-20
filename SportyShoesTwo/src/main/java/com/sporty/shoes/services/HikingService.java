package com.sporty.shoes.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sporty.shoes.dao.HikingRepository;
import com.sporty.shoes.entities.Hiking;

@Service
public class HikingService {
	@Autowired
	HikingRepository repo;
	
	
	public Optional<Hiking> getHikingById(Integer id){
		return repo.findById(id);
	}
	
	public Iterable<Hiking> getAllHiking() {
		return repo.findAll();
	}
	public void addHiking(Hiking hiking) {
		 repo.save(hiking);
	}
	
	public Hiking findByBrand(String brand) {
		return repo.findByBrand(brand);
	}
	

}

package com.sporty.shoes.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sporty.shoes.dao.RunningRepository;
import com.sporty.shoes.entities.Running;


@Service
public class RunningService {
	@Autowired
	RunningRepository repo;
	
	public Optional<Running> getRunningById(Integer id){
		return repo.findById(id);
	}
	
	public Running findByBrand(String brand) {
		return repo.findByBrand(brand);
	}
	
	public Iterable<Running> getAllRunning() {
		return repo.findAll();
	}
	public void addRunning(Running running) {
		 repo.save(running);
	}
	
	public void updateRunning (Running running) {
		repo.save(running);
	}

}


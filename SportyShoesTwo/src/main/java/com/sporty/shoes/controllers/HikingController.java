package com.sporty.shoes.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sporty.shoes.entities.Hiking;
import com.sporty.shoes.services.HikingService;

@RestController
public class HikingController {

	@Autowired
	HikingService service;
	
	@GetMapping("/hiking/{id}")
	public Optional<Hiking> getRunningById(@PathVariable Integer id){
		return (Optional<Hiking>) service.getHikingById(id);
		
	}
	
	@GetMapping("/hiking/brand/{brand}") //http://localhost:8080/running/brand/Asics:Quantum Lyte
	public Hiking findByBrand(@PathVariable String brand) {
		return service.findByBrand(brand);
	}
	
	@GetMapping("/hiking")
	List<Hiking> getAllSneakers() {
		return (List<Hiking>) service.getAllHiking();
	}
	
	@PostMapping("/hiking/add")
	public void addHiking(@RequestBody Hiking hiking){
		service.addHiking(hiking);
		
	}
	
	@DeleteMapping("/hiking/delete/{id}")
	public void deletById (@PathVariable Integer id) {
		service.deletById(id);
	}
	
	
}

package com.sporty.shoes.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.sporty.shoes.entities.Sneakers;
import com.sporty.shoes.services.SneakersService;

@RestController
public class SneakersController {
	@Autowired
	SneakersService service;
	
	@GetMapping("/sneakers/{id}")
	public Optional<Sneakers> getRunningById(@PathVariable Integer id){
		return (Optional<Sneakers>) service.getSneakersById(id);
		
	}
	
	@GetMapping("/sneakers/brand/{brand}") //http://localhost:8080/running/brand/Asics:Quantum Lyte
	public Sneakers findByBrand(@PathVariable String brand) {
		return service.findByBrand(brand);
	}
	
	@GetMapping("/sneakers")
	List<Sneakers> getAllSneakers() {
		return (List<Sneakers>) service.getAllSneakers();
	}
	
	@PostMapping("/sneakers/add")
	public void addSneakers(@RequestBody Sneakers sneakers){
		service.addSneakers(sneakers);
		
	}
	

	
	

}

package com.sporty.shoes.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sporty.shoes.entities.Running;
import com.sporty.shoes.entities.Sneakers;
import com.sporty.shoes.services.RunningService;


@RestController
public class RunningController {
	@Autowired
	RunningService service;

	@GetMapping("/running/{id}")
	public Optional<Running> getRunningById(@PathVariable Integer id){
		return (Optional<Running>) service.getRunningById(id);
		
	}
	
	@GetMapping("/running/brand/{brand}") //http://localhost:8080/running/brand/Asics:Quantum Lyte
	public Running findByBrand(@PathVariable String brand) {
		return service.findByBrand(brand);
	}
	
	@GetMapping("/running")
	public Iterable<Running> getAllRunning() {
		return (Iterable<Running>) service.getAllRunning();
	}
	@PostMapping("/running/add")
	public void addRunning(@RequestBody Running running) {
		service.addRunning(running);
		
	}
}

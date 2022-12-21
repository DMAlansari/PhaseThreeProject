package com.sporty.shoes.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sporty.shoes.entities.Receipt;
import com.sporty.shoes.entities.Sneakers;
import com.sporty.shoes.services.ReceiptService;

@RestController
public class ReceiptController {
	@Autowired
	ReceiptService service;
	
	@GetMapping("/receipt/{id}")
	public Optional<Receipt> getReceiptById(@PathVariable Integer id){
		return (Optional<Receipt>) service.getReceiptById(id);
	}
	
	@GetMapping("/receipt")
	public Iterable<Receipt> getReceipts() {
		return (Iterable<Receipt> )service.getReceipts();
	}
	@PostMapping("/receipt/add/")
	public void addReceipt(@RequestBody Receipt receipt ) {
		service.addReceipt(receipt);
	}
	
//	Receipt findByDate(@PathVariable String date) {
//		return service.findByDate(date);
//	}
//	
//	@PostMapping("/places/{useId}")
//	void addNewPlace(@RequestBody Place place, @PathVariable Integer userId) {
//		//Before adding a new place, map it to a User : Because places without users can't exist :
//		place.setUser(new User(userId, "", ""));
//		
//		service.addPlace(place);
	
	@GetMapping("receipt/by/date/{date}")
	public Receipt findByDate(@PathVariable String date) {
		return service.findByDate(date);
	}
	
//	@GetMapping("receipt/by/type/")
//	public Receipt findByType(@PathVariable String type) {
//		return service.findByType(type);
//	}

}

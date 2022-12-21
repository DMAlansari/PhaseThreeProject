package com.sporty.shoes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sporty.shoes.entities.Purchased;
import com.sporty.shoes.entities.Receipt;
import com.sporty.shoes.services.PurchasedService;
import com.sporty.shoes.services.ReceiptService;

@RestController
public class PurchaseController {
	
	@Autowired
	PurchasedService service;
	ReceiptService service2;
	
	@GetMapping("/Purchased/receipt/{receiptSerialNumber}")
	List<Purchased> getAllPurchasesByReceipt(@PathVariable Integer receiptSerialNumber) {
		return service.getAllPurchasesByReceipt(receiptSerialNumber);
	}
	
	@GetMapping("/Purchased")
	Iterable<Purchased> getAllPurchases () {
		return service.getAllPurchases();
	}
	
	@PostMapping("/Purchased/add/receipt/{receiptSerialNumber}")
	void addPurchase(@RequestBody Purchased purchased, @PathVariable Integer receiptSerialNumber) {
		
		purchased.setReceipt(new Receipt(receiptSerialNumber,""));
		service.addPurchase(purchased);
	}
	
	@PutMapping("/Purchased/update/receipt/{receiptSerialNumber}")
	void updatePurchase(@RequestBody Purchased purchased, @PathVariable Integer receiptSerialNumber) {
		purchased.setReceipt(new Receipt(receiptSerialNumber,""));
		service.addPurchase(purchased);
	}
	
	@DeleteMapping("/Purchased/delete/{purchasSerialId}")
	void deletePurchaseById(@PathVariable Integer purchasSerialId) {
		service.deletePurchaseById(purchasSerialId);
	}
	@GetMapping("/Purchased/find/by/{type}")
	List<Purchased> findAllByType(@PathVariable String type) {
		return service.findAllByType(type);
	}
	
//	@GetMapping("/Purchased/find/bydate/{date}")
//	List<Purchased> findAllByDate(@PathVariable String date) {
//		return service.findAllByDate(date);
//	}
	@GetMapping("/Purchased/find/bydate/{date}")
	Receipt findByDate(@PathVariable String date) {
		return service2.findByDate(date);
	};
	
	

	
	

}

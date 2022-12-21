package com.sporty.shoes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sporty.shoes.dao.PurchasedRepository;
import com.sporty.shoes.dao.ReceiptRepository;
import com.sporty.shoes.entities.Purchased;
import com.sporty.shoes.entities.Receipt;


@Service
public class PurchasedService {
	@Autowired
	PurchasedRepository repo;
	ReceiptRepository repo2;
	
	public List<Purchased> getAllPurchasesByReceipt(Integer receiptSerialNumber) {
		return repo.findAllByReceipt(receiptSerialNumber);
	}
	
	public Iterable<Purchased> getAllPurchases() {
		return repo.findAll();
	}
	
	public void addPurchase(Purchased purchased) {
		repo.save(purchased);
	}
	
	public void updatePurchase(Purchased purchased) {
		repo.save(purchased);
	}
	
	public void deletePurchaseById (Integer serialNumber) {
		repo.deleteById(serialNumber);
	}
	
	public List<Purchased> findAllByType(String type) {
	 return repo.findAllByType(type);		 
	}
	
	public Receipt findAllByDate(String date){
		return repo2.findByDate(date);
	}
	

}

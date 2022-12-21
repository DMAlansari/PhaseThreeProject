package com.sporty.shoes.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sporty.shoes.dao.ReceiptRepository;
import com.sporty.shoes.entities.Receipt;

@Service
public class ReceiptService {
	
		@Autowired
		ReceiptRepository repo;
		
		
		public Optional<Receipt> getReceiptById(Integer id){
			return repo.findById(id);
		}
		
		public Iterable<Receipt> getReceipts() {
			return repo.findAll();
		}
		public void addReceipt(Receipt receipt) {
			 repo.save(receipt);
		}
		
		public Receipt findByDate(String date) {
			return repo.findByDate(date);
		}
		
//		public Receipt findByType(String type) {
//			return repo.findByType(type);
//		}
//		
		

	}

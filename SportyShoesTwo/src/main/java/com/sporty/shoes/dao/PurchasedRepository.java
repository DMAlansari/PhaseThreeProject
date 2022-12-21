package com.sporty.shoes.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.sporty.shoes.entities.Purchased;

@Repository
public interface PurchasedRepository extends CrudRepository <Purchased,Integer>{
 
	List<Purchased> findAllByReceipt(Integer receiptSerialNumber);
	List<Purchased> findAllByType(String type);
	//List<Purchased> findAllByDate(String date);
}

package com.sporty.shoes.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sporty.shoes.entities.Receipt;

@Repository
public interface ReceiptRepository extends CrudRepository <Receipt,Integer>{

}

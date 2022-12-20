package com.sporty.shoes.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.sporty.shoes.entities.Purchased;

@Repository
public interface PurchasedRepository extends CrudRepository <Purchased,Integer>{

}

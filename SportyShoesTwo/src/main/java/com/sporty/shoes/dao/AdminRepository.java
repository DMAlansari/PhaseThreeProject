package com.sporty.shoes.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.sporty.shoes.entities.Admin;

@Repository
public interface AdminRepository  extends CrudRepository <Admin,String>{ 

}

package com.sporty.shoes.dao;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sporty.shoes.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
// the built in methods and custom methods

	

}

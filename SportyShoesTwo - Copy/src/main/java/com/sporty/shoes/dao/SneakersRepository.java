package com.sporty.shoes.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.sporty.shoes.entities.Sneakers;

@Repository
public interface SneakersRepository extends CrudRepository<Sneakers, Integer> {
}

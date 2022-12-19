package com.sporty.shoes.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sporty.shoes.entities.Running;

@Repository
public interface RunningRepository extends CrudRepository<Running, Integer> {

}

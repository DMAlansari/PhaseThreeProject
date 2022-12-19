package com.sporty.shoes.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.sporty.shoes.entities.Hiking;


@Repository // هذا البين قاعد يرتبط بالداتا بيس
public interface HikingRepository extends CrudRepository<Hiking, Integer>  {

}

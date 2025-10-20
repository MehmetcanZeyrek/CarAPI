package com.mehmetcan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mehmetcan.entities.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

	
	
	
	
}

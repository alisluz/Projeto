package com.example.street.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.street.model.StreetModel;

public interface StreetRepository extends JpaRepository<StreetModel, Long> {
	
	StreetModel findById(long id);
	
	StreetModel save();
	
	StreetModel delete();

}

package com.capgemini.drinksanddelight.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.drinksanddelight.entities.DistributorEntity;

public interface DistributorDetailsDao extends JpaRepository<DistributorEntity,String> {

	
	
	
}

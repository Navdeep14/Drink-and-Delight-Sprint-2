package com.capgemini.drinksanddelight.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.capgemini.drinksanddelight.entities.DistributorEntity;
import org.springframework.stereotype.Repository;


/*
@author NAVDEEP TRIPATHI
*/

@Repository
public interface DistributorDetailsDao extends JpaRepository<DistributorEntity,String> {

	
	
	
}

package com.capgemini.drinksanddelight.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.capgemini.drinksanddelight.entities.ProductStockDetails;

@Repository
public interface ProductStockDao extends JpaRepository<ProductStockDetails,String>{
	
		

}

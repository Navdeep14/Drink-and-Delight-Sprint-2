package com.capgemini.drinksanddelight.dao;

import java.time.LocalDate;
import java.util.List;
import com.capgemini.drinksanddelight.entities.DistributorEntity;
import com.capgemini.drinksanddelight.entities.ProductOrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/*
@author NAVDEEP TRIPATHI
*/

@Repository
public interface ProductOrderDao extends JpaRepository<ProductOrderEntity,String> {

	boolean updateTrackOrder(String orderId, String location, LocalDate date);

	ProductOrderEntity trackOrder(String id);

	List<DistributorEntity> reterive();

	ProductOrderEntity PlaceProductOrder(String orderId, ProductOrderEntity details);

	List<ProductOrderEntity> fetchAll();
	
	
}


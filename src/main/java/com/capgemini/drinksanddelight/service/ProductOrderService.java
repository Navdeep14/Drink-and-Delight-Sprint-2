package com.capgemini.drinksanddelight.service;

import java.time.LocalDate;
import java.util.List;

import com.capgemini.drinksanddelight.entities.ProductOrderEntity;

public interface ProductOrderService {
	
	ProductOrderEntity save(ProductOrderEntity productorderentity);

    List<ProductOrderEntity> fetchAll();

	ProductOrderEntity PlaceProductOrder(String orederId, ProductOrderEntity details);

}



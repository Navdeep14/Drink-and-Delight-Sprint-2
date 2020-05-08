package com.capgemini.drinksanddelight.service;

import java.time.LocalDate;
import java.util.List;

import com.capgemini.drinksanddelight.entities.ProductOrderEntity;

public interface ProductOrderService {
	
	ProductOrderEntity save(ProductOrderEntity productorderentity);

	ProductOrderEntity PlaceProductOrder(String orederId, String name,String distributorId,double quantityValue,double quantityUnit,double pricePerUnit,LocalDate expectedDeliveryDate,double totalPrice);

    List<ProductOrderEntity> fetchAll();

}



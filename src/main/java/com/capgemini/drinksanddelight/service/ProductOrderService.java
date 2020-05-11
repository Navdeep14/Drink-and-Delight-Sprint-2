package com.capgemini.drinksanddelight.service;

import java.time.LocalDate;
import java.util.List;

import com.capgemini.drinksanddelight.entities.ProductOrderEntity;

public interface ProductOrderService {
	
	ProductOrderEntity save(ProductOrderEntity productorderentity);

    List<ProductOrderEntity> fetchAll();

	ProductOrderEntity PlaceProductOrder(String orederId,String name, String supplierid, double quantityValue, double quantityUnit,
			double pricePerUnit, LocalDate expectedDeliveryDate, double totalPrice);

    boolean updateTrackOrder(String orderId, String location, LocalDate date);
}



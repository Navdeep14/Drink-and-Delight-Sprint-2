package com.capgemini.drinksanddelight.service;

import java.time.LocalDate;
import java.util.List;

import com.capgemini.drinksanddelight.entities.ProductOrderEntity;
import com.capgemini.drinksanddelight.exception.OrderIdNotFoundException;

public interface ProductOrderService {

	ProductOrderEntity save(ProductOrderEntity productorderentity);

	List<ProductOrderEntity> fetchAll();

	ProductOrderEntity placeProductOrder(String orderId, String name, String supplierid, double quantityValue,
			double quantityUnit, double pricePerUnit, LocalDate expectedDeliveryDate, double totalPrice);

	ProductOrderEntity updateTrackOrder(String orderId, String location, LocalDate date);
	
	ProductOrderEntity trackOrder(String orderId) throws OrderIdNotFoundException;
}

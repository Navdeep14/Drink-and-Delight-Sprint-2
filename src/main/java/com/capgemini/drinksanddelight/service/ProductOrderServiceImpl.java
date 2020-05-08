package com.capgemini.drinksanddelight.service;

import java.time.LocalDate;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.capgemini.drinksanddelight.entities.ProductOrderEntity;

@Service
@Transactional
public class ProductOrderServiceImpl implements ProductOrderService
{

	@Override
	public ProductOrderEntity save(ProductOrderEntity productorderentity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductOrderEntity PlaceProductOrder(String orederId, String name, String distributorId,
			double quantityValue, double quantityUnit, double pricePerUnit, LocalDate expectedDeliveryDate,
			double totalPrice) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductOrderEntity> fetchAll() {
		// TODO Auto-generated method stub
		return null;
	}

}

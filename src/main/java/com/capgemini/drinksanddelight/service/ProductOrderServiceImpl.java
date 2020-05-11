package com.capgemini.drinksanddelight.service;

import java.time.LocalDate;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.drinksanddelight.dao.ProductOrderDao;
import com.capgemini.drinksanddelight.entities.ProductOrderEntity;

@Service
@Transactional
public class ProductOrderServiceImpl implements ProductOrderService
{

	
	@Autowired
	ProductOrderDao dao;
	
	
	@Override
	public ProductOrderEntity save(ProductOrderEntity productorderentity) {
		productorderentity=dao.save(productorderentity);
		return productorderentity;
	}

	@Override
	public ProductOrderEntity PlaceProductOrder(String orderId,String name, String supplierid, double quantityValue, double quantityUnit,
			double pricePerUnit, LocalDate expectedDeliveryDate, double totalPrice) {
		ProductOrderEntity productorderentity=new ProductOrderEntity();
		productorderentity.setOrderId(orderId);
		productorderentity.setName(name);
		productorderentity.setSupplierId(supplierid);
		productorderentity.setQuantityUnit(quantityUnit);
		productorderentity.setPricePerUnit(pricePerUnit);
		productorderentity.setQuantityValue(quantityValue);
		productorderentity.setExpectedDeliveryDate(expectedDeliveryDate);
		productorderentity.setTotalPrice(totalPrice);
		return productorderentity;
	
	}

	@Override
	public List<ProductOrderEntity> fetchAll() {
		 List<ProductOrderEntity>productorderentity=dao.findAll();
	        return productorderentity;
	}

	

}

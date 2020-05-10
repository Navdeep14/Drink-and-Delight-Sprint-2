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
	public ProductOrderEntity PlaceProductOrder(String orderId,ProductOrderEntity details) {
		ProductOrderEntity productorderentity=new ProductOrderEntity();
		productorderentity=dao.PlaceProductOrder(orderId,details);
		return productorderentity;
	
	}

	@Override
	public List<ProductOrderEntity> fetchAll() {
		 List<ProductOrderEntity>productorderentity=dao.findAll();
	        return productorderentity;
	}

	

}

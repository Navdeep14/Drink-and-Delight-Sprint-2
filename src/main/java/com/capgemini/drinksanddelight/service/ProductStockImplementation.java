package com.capgemini.drinksanddelight.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.drinksanddelight.dao.ProductStockDao;
import com.capgemini.drinksanddelight.entities.ProductOrderEntity;
import com.capgemini.drinksanddelight.entities.ProductStockDetails;


@Service
@Transactional
public class ProductStockImplementation implements ProductStockInterface{

	@Autowired
	private ProductStockDao daoObj;
	
	


	@Override
	public ProductStockDetails save(ProductStockDetails productstockdetails) {
		productstockdetails=daoObj.save(productstockdetails);
		return productstockdetails;
	}




	@Override
	public List<ProductStockDetails> fetchAll() {
		List<ProductStockDetails>productstockdetails=daoObj.findAll();
        return productstockdetails;
	}



/*
	@Override
	public List<ProductStockDetails> retrieve() {
		List<ProductStockDetails> productstockdetails=new ArrayList<ProductStockDetails>();
		productstockdetails=daoObj.findAll();
		return productstockdetails;
	}

*/


	@Override
	public String getProductName(String id) {
		String name = " ";
		Optional<ProductStockDetails> optional=daoObj.findById(id);
		if(optional.isPresent()) {
			ProductStockDetails details = optional.get();
			name = details.getName();
		}
		return name;
	}

	
	

}

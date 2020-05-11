package com.capgemini.drinksanddelight.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
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




	@Override
	public List<ProductStockDetails> retrieve() {
		List<ProductStockDetails> productstockdetails=new ArrayList<ProductStockDetails>();
		productstockdetails=daoObj.findAll();
		return productstockdetails;
	}




	@Override
	public ProductStockDetails getProductName(String id) {
		ProductStockDetails productstockdetails=new ProductStockDetails();
		productstockdetails.setStockId(id);
		String productname=productstockdetails.getProductName(id);
		return productstockdetails;
	}

	
	

}

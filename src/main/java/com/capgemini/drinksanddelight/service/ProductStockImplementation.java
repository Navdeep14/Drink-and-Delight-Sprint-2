package com.capgemini.drinksanddelight.service;

import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.drinksanddelight.dao.ProductStockDao;
import com.capgemini.drinksanddelight.entities.ProductStockDetails;


@Service
@Transactional
public class ProductStockImplementation implements ProductStockInterface{

	@Autowired
	ProductStockDao daoObj;
	
	


	@Override
	public ProductStockDetails save(ProductStockDetails productstockdetails) {
		productstockdetails=daoObj.save(productstockdetails);
		return productstockdetails;
	}

	


	@Override
	public ProductStockDetails UpdateProductStock(String stockId, ProductStockDetails details) {
		ProductStockDetails productstockdetails=new ProductStockDetails();
		productstockdetails=daoObj.UpdateProductStock(stockId,details);
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
		productstockdetails=daoObj.reterive();
		return productstockdetails;
	}
	




	@Override
	public ProductStockDetails getProductSpecs(String stockId) {
		ProductStockDetails productstockdetails=new ProductStockDetails();
		productstockdetails=daoObj.getProductSpecs(stockId);
		return productstockdetails;
	}




	
	
	

}

package com.capgemini.drinksanddelight.service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import com.capgemini.drinksanddelight.entities.ProductStockDetails;
import com.capgemini.drinksanddelight.entities.ProductStockDetails;

public interface ProductStockInterface {
	
	
	ProductStockDetails save(ProductStockDetails productstockdetails);

	ProductStockDetails UpdateProductStock(String stockId,ProductStockDetails details);

    List<ProductStockDetails> fetchAll();

	List<ProductStockDetails> retrieve();

	ProductStockDetails getProductName(String id);

}


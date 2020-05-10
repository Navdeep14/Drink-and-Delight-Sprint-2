package com.capgemini.drinksanddelight.service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import com.capgemini.drinksanddelight.entities.ProductStockDetails;
import com.capgemini.drinksanddelight.entities.ProductStockDetails;

public interface ProductStockInterface {
	
	
	ProductStockDetails save(ProductStockDetails productstockdetails);

	ProductStockDetails UpdateProductStock(String stockId, String name, String supplierId, double quantityValue, double quantityUnit,
			double pricePerUnit, String warehouseId, LocalDate manufactureDate, LocalDate expiryDate,
			String qualityCheck);

    List<ProductStockDetails> fetchAll();

	List<ProductStockDetails> retrieve();

	String getProductName(String id);

}


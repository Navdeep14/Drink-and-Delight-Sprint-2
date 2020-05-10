package com.capgemini.drinksanddelight.service;

import java.time.LocalDate;
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
	public ProductStockDetails UpdateProductStock(String stockId, String name, String supplierId, double quantityValue, double quantityUnit,
			double pricePerUnit, String warehouseId, LocalDate manufactureDate, LocalDate expiryDate,
			String qualityCheck) {
		ProductStockDetails productstockdetails=new ProductStockDetails();
		productstockdetails.setStockId(stockId);
		productstockdetails.setName(name);
		productstockdetails.setSupplierId(supplierId);
		productstockdetails.setQuantityValue(quantityValue);
		productstockdetails.setQuantityUnit(quantityUnit);
		productstockdetails.setPricePerUnit(pricePerUnit);
		productstockdetails.setWarehouseId(warehouseId);
		productstockdetails.setManufactureDate(manufactureDate);
		productstockdetails.setExpiryDate(expiryDate);
		productstockdetails.setQualityCheck(qualityCheck);
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
	public String getProductName(String id) {
		ProductStockDetails productstockdetails=new ProductStockDetails();
		productstockdetails.setStockId(id);
		String productname=productstockdetails.getProductName(id);
		return productname;
	}

	
	

}

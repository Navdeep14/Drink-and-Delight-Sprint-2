package com.capgemini.drinksanddelight.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.capgemini.drinksanddelight.entities.ProductStockDetails;

public interface ProductStockDao extends JpaRepository<ProductStockDetails,String>{
	
	public ProductStockDetails getProductSpecs(String stockId);
	
	public List<com.capgemini.drinksanddelight.entities.ProductStockDetails> reterive();

	public List<ProductStockDetails> fetchAll();

	public ProductStockDetails UpdateProductStock(String stockId, ProductStockDetails details);

	

	

}

package com.capgemini.drinksanddelight.dao;

import java.time.LocalDate;
import java.util.List;
import com.capgemini.drinksanddelight.entities.Distributordetails;
import com.capgemini.drinksanddelight.entities.ProductorderDetails;


/*
@author NAVDEEP TRIPATHI
*/

public interface ProjectDao {
	
	
	
	public List<Distributordetails> reterive();
	
	public boolean updateTrackOrder(String orderId,String Location,LocalDate date);
	
	
	public ProductorderDetails trackOrder(String id);
	
	
	
	
	
	
	
	

}

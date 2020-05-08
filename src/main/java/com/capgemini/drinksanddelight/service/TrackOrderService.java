package com.capgemini.drinksanddelight.service;

import com.capgemini.drinksanddelight.entities.ProductOrderEntity;
import com.capgemini.drinksanddelight.exception.OrderIdNotFoundException;

/*
@author NAVDEEP TRIPATHI
*/

public interface TrackOrderService {
	
	
	public ProductOrderEntity trackOrder(String id) throws OrderIdNotFoundException;
	

}

package com.capgemini.drinksanddelight.service;

import java.time.LocalDate;
import com.capgemini.drinksanddelight.exception.OrderIdNotFoundException;

/*
@author NAVDEEP TRIPATHI
*/

public interface UpdateTrackOrderService {

	
	public boolean updateTrackOrder(String orderId, String Location, LocalDate date) throws OrderIdNotFoundException ;
	

}

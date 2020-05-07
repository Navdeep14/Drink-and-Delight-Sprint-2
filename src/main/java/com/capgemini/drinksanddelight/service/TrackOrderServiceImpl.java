package com.capgemini.drinksanddelight.service;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.drinksanddelight.dao.ProjectDao;
import com.capgemini.drinksanddelight.entities.ProductorderDetails;
import com.capgemini.drinksanddelight.exception.OrderIdNotFoundException;

/*
@author NAVDEEP TRIPATHI
*/

@Service
@Transactional
public class TrackOrderServiceImpl implements TrackOrderService {

	
	@Autowired
	ProjectDao daoObj;
	
	
	
	@Override
	public ProductorderDetails trackOrder(String id) throws OrderIdNotFoundException {
		
		ProductorderDetails details=null;
		details=daoObj.trackOrder(id);
		
		
		return details;
	}
	
	
	
	
	

}

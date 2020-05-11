package com.capgemini.drinksanddelight.service;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.drinksanddelight.dao.ProductOrderDao;
import com.capgemini.drinksanddelight.entities.ProductOrderEntity;
import com.capgemini.drinksanddelight.exception.OrderIdNotFoundException;

/*
@author NAVDEEP TRIPATHI
*/

@Service
@Transactional
public class TrackOrderServiceImpl implements TrackOrderService {

	
	@Autowired
	private ProductOrderDao daoObj;
	
	
	
	@Override
	public ProductOrderEntity trackOrder(String id) throws OrderIdNotFoundException {
		
		ProductOrderEntity details=new ProductOrderEntity();
		details.setOrderId(id);
		details=daoObj.save(details);
		
		return details;
	}
	
	
	
	
	

}

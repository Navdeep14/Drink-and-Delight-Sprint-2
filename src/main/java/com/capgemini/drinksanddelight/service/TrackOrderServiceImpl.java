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
	ProductOrderDao daoObj;
	
	
	
	@Override
	public ProductOrderEntity trackOrder(ProductOrderEntity productorderentity) throws OrderIdNotFoundException {
		
		ProductOrderEntity details=new ProductOrderEntity();
		details=daoObj.save(productorderentity);
		
		
		return details;
	}
	
	
	
	
	

}

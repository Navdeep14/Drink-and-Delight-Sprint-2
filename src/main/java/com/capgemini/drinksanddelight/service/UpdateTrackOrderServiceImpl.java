package com.capgemini.drinksanddelight.service;

import java.time.LocalDate;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.drinksanddelight.dao.ProductOrderDao;
import com.capgemini.drinksanddelight.entities.ProductOrderEntity;
import com.capgemini.drinksanddelight.exception.OrderIdNotFoundException;
import com.capgemini.drinksanddelight.util.ExceptionConstants;

@Service
@Transactional
public class UpdateTrackOrderServiceImpl implements UpdateTrackOrderService {
	
	
	@Autowired
	private ProductOrderDao daoObj;
	

	@Override
	public boolean updateTrackOrder(String orderId, String Location, LocalDate date) throws OrderIdNotFoundException {
		ProductOrderEntity productorderentity= new ProductOrderEntity();
		boolean check= ((UpdateTrackOrderService) productorderentity).updateTrackOrder(orderId,Location,date);
		
		return check;
		
	}

}

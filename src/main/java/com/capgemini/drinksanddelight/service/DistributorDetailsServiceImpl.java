package com.capgemini.drinksanddelight.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.drinksanddelight.dao.ProductOrderDao;
import com.capgemini.drinksanddelight.entities.DistributorEntity;

/*
@author NAVDEEP TRIPATHI
*/

@Service
@Transactional
public class DistributorDetailsServiceImpl implements DistributorDetailsService{
	
	
	@Autowired
	ProductOrderDao daoObj;

	@Override
	public List<DistributorEntity> reterive() {
		
		
		return daoObj.reterive();
		
	}
	
	
	

}

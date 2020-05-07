package com.capgemini.drinksanddelight.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.drinksanddelight.dao.ProjectDao;
import com.capgemini.drinksanddelight.entities.Distributordetails;

/*
@author NAVDEEP TRIPATHI
*/

@Service
@Transactional
public class DistributorDetailsServiceImpl implements DistributorDetailsService{
	
	
	@Autowired
	ProjectDao daoObj;

	@Override
	public List<Distributordetails> reterive() {
		
		
		return daoObj.reterive();
		
	}
	
	
	

}

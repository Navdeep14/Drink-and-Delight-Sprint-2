package com.capgemini.drinksanddelight.service;

import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.drinksanddelight.dao.DistributorDetailsDao;
import com.capgemini.drinksanddelight.entities.DistributorEntity;

/*
@author NAVDEEP TRIPATHI
*/

@Service
@Transactional
public class DistributorDetailsServiceImpl implements DistributorDetailsService{
	
	
	@Autowired
	private DistributorDetailsDao daoObj;

	@Override
	public List<DistributorEntity> reterive() {
		List<DistributorEntity> distributorentity=daoObj.findAll();
		return distributorentity;
		
	}

	@Override
	public DistributorEntity save(DistributorEntity distributordetails) {
		distributordetails = daoObj.save(distributordetails);
		return distributordetails;
		
	}
	
	
	

}

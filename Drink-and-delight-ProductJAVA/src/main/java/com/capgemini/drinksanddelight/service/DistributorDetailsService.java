package com.capgemini.drinksanddelight.service;

import java.util.List;
import com.capgemini.drinksanddelight.entities.DistributorEntity;

/*
@author NAVDEEP TRIPATHI
*/

public interface DistributorDetailsService {
	
	
	
	public List<DistributorEntity> reterive();

	public DistributorEntity save(DistributorEntity distributordetails);
	
	
	
	
	
	
	

}

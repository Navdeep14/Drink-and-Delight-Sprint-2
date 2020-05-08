package com.capgemini.drinksanddelight.controller;

import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.drinksanddelight.entities.DistributorEntity;
import com.capgemini.drinksanddelight.entities.ProductOrderEntity;
import com.capgemini.drinksanddelight.exception.OrderIdNotFoundException;
import com.capgemini.drinksanddelight.service.DistributorDetailsService;
import com.capgemini.drinksanddelight.service.TrackOrderService;
import com.capgemini.drinksanddelight.service.UpdateTrackOrderService;
import com.capgemini.drinksanddelight.util.ExceptionConstants;

/*
@author NAVDEEP TRIPATHI
*/

@RestController
@RequestMapping("/products")
public class ProjectController {
	
	@Autowired
	DistributorDetailsService serviceObj;
	
	@Autowired
	TrackOrderService trackObj;
	
	@Autowired
	UpdateTrackOrderService updateObj;
		
	@GetMapping("/getDistributorDetails")
    public ResponseEntity<List<DistributorEntity>> getProductList() {
			List<DistributorEntity> list = serviceObj.reterive();
			System.out.println("hi");
			return new ResponseEntity<List<DistributorEntity>>(list,HttpStatus.OK);
	}
	
	@GetMapping("/trackOrder/{id}")
    public ResponseEntity<ProductOrderEntity> trackOrder(@PathVariable("id") String id) throws OrderIdNotFoundException {
			ProductOrderEntity object = trackObj.trackOrder(id);
			
			if(object==null)
			{
				throw new OrderIdNotFoundException(ExceptionConstants.ID_NOT_EXIST);
			}
			else
			{
			return new ResponseEntity<ProductOrderEntity>(object,HttpStatus.OK);
			}
	}
	
	@PutMapping("/update/{orderId}/{location}/{date}")
	
	public  boolean updateTrackOrder(@PathVariable("orderId") String id,@PathVariable("location")String location,@PathVariable("date") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate date) throws OrderIdNotFoundException
	{
		
		
		boolean check= updateObj.updateTrackOrder(id, location, date);
		
		if(check==false)
		{
			throw new OrderIdNotFoundException(ExceptionConstants.ID_NOT_EXIST);
			
		}
		else
		{
			return check;
		}
			
	}
	 
}

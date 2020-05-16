package com.capgemini.drinksanddelight.controller;

import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.drinksanddelight.dto.DistributorDto;
import com.capgemini.drinksanddelight.dto.ProductDto;
import com.capgemini.drinksanddelight.dto.ProductStockDto;
import com.capgemini.drinksanddelight.entities.DistributorEntity;
import com.capgemini.drinksanddelight.entities.ProductOrderEntity;
import com.capgemini.drinksanddelight.entities.ProductStockDetails;
import com.capgemini.drinksanddelight.exception.OrderIdNotFoundException;
import com.capgemini.drinksanddelight.service.DistributorDetailsService;
import com.capgemini.drinksanddelight.service.ProductOrderService;
import com.capgemini.drinksanddelight.service.ProductStockInterface;
import com.capgemini.drinksanddelight.util.ExceptionConstants;

/*
@author NAVDEEP TRIPATHI
*/

@RestController
@RequestMapping("/products")
public class ProjectController {
	
	@Autowired
	private DistributorDetailsService serviceObj;
	
	@Autowired
	private ProductStockInterface stockobj;
	
	//@SuppressWarnings("unused")
	@Autowired
	private ProductOrderService orderobj;
		
	
	@PostMapping("/addproduct")
	public ResponseEntity<ProductOrderEntity> addProduct(@RequestBody ProductDto dto){
		ProductOrderEntity order = convertProductOrder(dto);
		order = orderobj.save(order);	
		ResponseEntity<ProductOrderEntity>response = new ResponseEntity<>(order, HttpStatus.OK);
		return response;
		
	}
	
	private ProductOrderEntity convertProductOrder(ProductDto dto) {
		ProductOrderEntity order = new ProductOrderEntity();
		order.setOrderId(dto.getOrderId());
		order.setName(dto.getName());
		order.setPricePerUnit(dto.getPricePerUnit());
		order.setQuantityUnit(dto.getQuantityUnit());
		order.setQuantityValue(dto.getQuantityValue());
		order.setSupplierId(dto.getSupplierId());
		order.setExpectedDeliveryDate(dto.getExpectedDeliveryDate());
		order.setLocation(dto.getLocation());
		order.setTotalPrice(dto.getTotalPrice());
		return order;
	}
	
	private ProductStockDetails convertProductStock(ProductStockDto stockdto) {
		ProductStockDetails stockdetails = new ProductStockDetails();
		stockdetails.setStockId(stockdto.getStockId());
		stockdetails.setName(stockdto.getName());
		stockdetails.setPricePerUnit(stockdto.getPricePerUnit());
		stockdetails.setQuantityUnit(stockdto.getQuantityUnit());
		stockdetails.setQuantityValue(stockdto.getQuantityValue());
		stockdetails.setSupplierId(stockdto.getSupplierId());
		stockdetails.setExpiryDate(stockdto.getExpiryDate());
		stockdetails.setWarehouseId(stockdto.getWarehouseId());
		stockdetails.setManufactureDate(stockdto.getManufactureDate());
		stockdetails.setQualityCheck(stockdto.getQualityCheck());
		return stockdetails;
	}
	
	private DistributorEntity convertDistributorEntity(DistributorDto disdto) {
		DistributorEntity distributordetails = new DistributorEntity();
		distributordetails.setDistributor_Id(disdto.getDistributor_Id());
		distributordetails.setDistributor_Name(disdto.getDistributor_Name());
		distributordetails.setDistributor_Address(disdto.getDistributor_Address());
		distributordetails.setDistributor_Phn(disdto.getDistributor_Phn());
		return distributordetails;
	}
	
	
	@GetMapping("/getDistributorDetails")
    public ResponseEntity<List<DistributorEntity>> getProductList() {
			List<DistributorEntity> list = serviceObj.reterive();
			System.out.println("hi");
			return new ResponseEntity<List<DistributorEntity>>(list,HttpStatus.OK);
	}
	
	@GetMapping("/trackOrder/{id}")
    public ResponseEntity<ProductOrderEntity> trackOrder(@PathVariable("id") String id) throws OrderIdNotFoundException {
			ProductOrderEntity order = orderobj.trackOrder(id);
			return new ResponseEntity<ProductOrderEntity>(order,HttpStatus.OK);
	}
	
	/*
	@PutMapping("/update/{orderId}/{location}/{date}")
	public ResponseEntity<ProductOrderEntity> updateTrackOrder(@PathVariable("orderId") String id,@PathVariable("location")String location,@PathVariable("date") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate date) 
	{
		ProductOrderEntity order = orderobj.updateTrackOrder(id, location, date);
		
			
	}
	 
	
	@PutMapping("/updateProduct/{id}")
	public ResponseEntity<ProductStockDetails> updateProductStock(@PathVariable String id, @RequestBody ProductOrderEntity details ){
		ProductStockDetails list = stockobj.UpdateProductStock(id,details);
		return new ResponseEntity<ProductStockDetails>(list,HttpStatus.OK);
		
	}
	*/
	
	
	@GetMapping("/getProductName/{id}")
	public ResponseEntity<String> getProductName(@PathVariable String id)
	{
		String stockName = stockobj.getProductName(id);
		return new ResponseEntity<String>(stockName,HttpStatus.OK);
	}
	
	@GetMapping("/getAllProductSpecs")
    public ResponseEntity<List<ProductStockDetails>> getProductStockList() {
			List<ProductStockDetails> list = stockobj.fetchAll();
			return new ResponseEntity<List<ProductStockDetails>>(list,HttpStatus.OK);
	}
	
	@PostMapping("/addstock")
	public ResponseEntity<ProductStockDetails> addStock(@RequestBody ProductStockDto stockdto){
		ProductStockDetails stockdetails = convertProductStock(stockdto);
		stockdetails = stockobj.save(stockdetails);	
		ResponseEntity<ProductStockDetails>response = new ResponseEntity<>(stockdetails, HttpStatus.OK);
		return response;
		
	}
	
	@PostMapping("/adddistributor")
	public ResponseEntity<DistributorEntity> addDistributor(@RequestBody DistributorDto disdto){
		DistributorEntity distributordetails = convertDistributorEntity(disdto);
		distributordetails = serviceObj.save(distributordetails);	
		ResponseEntity<DistributorEntity>response = new ResponseEntity<>(distributordetails, HttpStatus.OK);
		return response;
		
	}

	
	

	
}

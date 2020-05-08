package com.capgemini.drinksanddelight.entities;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

/*
@author NAVDEEP TRIPATHI
*/


@Entity
@DynamicInsert
@DynamicUpdate
public class ProductOrderEntity {
	
	@Id
	private String orderId;
	private String name;
	private String distributorId;
	private double quantityValue;
	private double quantityUnit;
	private double pricePerUnit;
	private LocalDate expectedDeliveryDate;
	private double totalPrice;
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getDistributorId() {
		return distributorId;
	}

	public void setDistributorId(String distributorId) {
		this.distributorId = distributorId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	private String location;
	
	public ProductOrderEntity()
	{
		
	}
	
	public ProductOrderEntity( String name, String supplierId, double quantityValue, double quantityUnit,
			double pricePerUnit, LocalDate expectedDeliveryDate, double totalPrice) {
		super();
		this.name = name;
		distributorId = supplierId;
		this.quantityValue = quantityValue;
		this.quantityUnit = quantityUnit;
		this.pricePerUnit = pricePerUnit;
		this.expectedDeliveryDate = expectedDeliveryDate;
		this.totalPrice = totalPrice;
	}

		public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSupplierId() {
		return distributorId;
	}

	public void setSupplierId(String supplierId) {
		distributorId = supplierId;
	}

	public double getQuantityValue() {
		return quantityValue;
	}

	public void setQuantityValue(double quantityValue) {
		this.quantityValue = quantityValue;
	}

	public double getQuantityUnit() {
		return quantityUnit;
	}

	public void setQuantityUnit(double quantityUnit) {
		this.quantityUnit = quantityUnit;
	}

	public double getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	public LocalDate getExpectedDeliveryDate() {
		return expectedDeliveryDate;
	}

	public void setExpectedDeliveryDate(LocalDate expectedDeliveryDate) {
		this.expectedDeliveryDate = expectedDeliveryDate;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
}

package com.capgemini.drinksanddelight.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@DynamicInsert
@DynamicUpdate	
@Table(name = "Stock_Details")
public class ProductStockDetails {
	
	

	@Id
	@GeneratedValue
	private String stockId;
	private String name;
	private String supplierId;
	private double quantityValue;
	private double quantityUnit;
	private double pricePerUnit;
	private String warehouseId;
	private LocalDate manufactureDate;
	private LocalDate expiryDate;
	private String qualityCheck;
	private ProductStockDetails details;
	
	


	public ProductStockDetails() {
		
	}


	public ProductStockDetails(String stockId, String name, String supplierId, double quantityValue, double quantityUnit,
			double pricePerUnit, String warehouseId, LocalDate manufactureDate, LocalDate expiryDate,
			String qualityCheck) {
		super();
		this.stockId = stockId;
		this.name = name;
		this.supplierId = supplierId;
		this.quantityValue = quantityValue;
		this.quantityUnit = quantityUnit;
		this.pricePerUnit = pricePerUnit;
		this.warehouseId = warehouseId;
		this.manufactureDate = manufactureDate;
		this.expiryDate = expiryDate;
		this.qualityCheck = qualityCheck;
	}


	public String getStockId() {
		return stockId;
	}


	public void setStockId(String stockId) {
		this.stockId = stockId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSupplierId() {
		return supplierId;
	}


	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
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


	public String getWarehouseId() {
		return warehouseId;
	}


	public void setWarehouseId(String warehouseId) {
		this.warehouseId = warehouseId;
	}


	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	@JsonFormat(pattern="yyyy-MM-dd")
	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	
	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	@JsonFormat(pattern="yyyy-MM-dd")
	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}


	public String getQualityCheck() {
		return qualityCheck;
	}


	public void setQualityCheck(String qualityCheck) {
		this.qualityCheck = qualityCheck;
	}
	
	public String getProductName(String id)
	{
		ProductStockDetails productstockdetails=new ProductStockDetails();
		if (this.stockId==id)
			return productstockdetails.getName();
		return "id mismatch";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((expiryDate == null) ? 0 : expiryDate.hashCode());
		result = prime * result + ((manufactureDate == null) ? 0 : manufactureDate.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(pricePerUnit);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((qualityCheck == null) ? 0 : qualityCheck.hashCode());
		temp = Double.doubleToLongBits(quantityUnit);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(quantityValue);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((stockId == null) ? 0 : stockId.hashCode());
		result = prime * result + ((supplierId == null) ? 0 : supplierId.hashCode());
		result = prime * result + ((warehouseId == null) ? 0 : warehouseId.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductStockDetails other = (ProductStockDetails) obj;
		if (expiryDate == null) {
			if (other.expiryDate != null)
				return false;
		} else if (!expiryDate.equals(other.expiryDate))
			return false;
		if (manufactureDate == null) {
			if (other.manufactureDate != null)
				return false;
		} else if (!manufactureDate.equals(other.manufactureDate))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(pricePerUnit) != Double.doubleToLongBits(other.pricePerUnit))
			return false;
		if (qualityCheck == null) {
			if (other.qualityCheck != null)
				return false;
		} else if (!qualityCheck.equals(other.qualityCheck))
			return false;
		if (Double.doubleToLongBits(quantityUnit) != Double.doubleToLongBits(other.quantityUnit))
			return false;
		if (Double.doubleToLongBits(quantityValue) != Double.doubleToLongBits(other.quantityValue))
			return false;
		if (stockId == null) {
			if (other.stockId != null)
				return false;
		} else if (!stockId.equals(other.stockId))
			return false;
		if (supplierId == null) {
			if (other.supplierId != null)
				return false;
		} else if (!supplierId.equals(other.supplierId))
			return false;
		if (warehouseId == null) {
			if (other.warehouseId != null)
				return false;
		} else if (!warehouseId.equals(other.warehouseId))
			return false;
		return true;
	}


	public void setDetails(ProductStockDetails details) {
		
		this.details=details;
		
	}

	
	
	
}

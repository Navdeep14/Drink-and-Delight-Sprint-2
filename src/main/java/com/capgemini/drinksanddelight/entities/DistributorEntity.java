package com.capgemini.drinksanddelight.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

/*
@author NAVDEEP TRIPATHI
*/

@Entity
@Table(name = "Distributor")
public class DistributorEntity {

	@Id
	private String distributor_Id;

	private String distributor_Name;

	private String distributor_Address;

	private String distributor_Phn;

	public DistributorEntity() {

	}

	public DistributorEntity(String distributor_id, String distributor_details, String distributor_address,
			String distributor_phn) {
		super();
		distributor_Id = distributor_id;
		distributor_Name = distributor_details;
		distributor_Address = distributor_address;
		distributor_Phn = distributor_phn;
	}

	public String getDistributor_Id() {
		return distributor_Id;
	}

	public void setDistributor_Id(String distributor_id) {
		distributor_Id = distributor_id;
	}

	public String getDistributor_Details() {
		return distributor_Name;
	}

	public void setDistributor_Name(String distributor_details) {
		distributor_Name = distributor_details;
	}

	public String getDistributor_Address() {
		return distributor_Address;
	}

	public void setDistributor_Address(String distributor_address) {
		distributor_Address = distributor_address;
	}

	public String getDistributor_Phn() {
		return distributor_Phn;
	}

	public void setDistributor_Phn(String distributor_phn) {
		distributor_Phn = distributor_phn;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((distributor_Id == null) ? 0 : distributor_Id.hashCode());
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
		DistributorEntity other = (DistributorEntity) obj;
		if (distributor_Id == null) {
			if (other.distributor_Id != null)
				return false;
		} else if (!distributor_Id.equals(other.distributor_Id))
			return false;
		return true;
	}

}

package com.capgemini.drinksanddelight.dto;

import java.util.Date;

/*
@author NAVDEEP TRIPATHI
*/

public class CustomEntityException {
	
	private Date timeStamp;
	private String message;
	private String errormsg;
	
	
	
	public CustomEntityException(Date date, String message, String errormsg) {
		super();
		this.timeStamp = date;
		this.message = message;
		this.errormsg = errormsg;
	}




	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getErrormsg() {
		return errormsg;
	}
	public void setErrormsg(String errormsg) {
		this.errormsg = errormsg;
	}
	

}

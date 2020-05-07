package com.capgemini.drinksanddelight.exception;

/*
@author NAVDEEP TRIPATHI
*/

	@SuppressWarnings("serial")
	public class OrderIdNotFoundException extends Exception{

		public OrderIdNotFoundException() {
			super();
		}
		
		public OrderIdNotFoundException(String msg) {
			super(msg);
		}
	}



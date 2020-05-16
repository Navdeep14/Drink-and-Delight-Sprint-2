package com.capgemini.drinksanddelight.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.capgemini.drinksanddelight.dto.CustomEntityException;

/*
@author NAVDEEP TRIPATHI
*/

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	
	
	@ExceptionHandler(value = OrderIdNotFoundException.class)
	public ResponseEntity<Object> productorderentityexception(OrderIdNotFoundException obj,WebRequest req){
		CustomEntityException err = new CustomEntityException(new Date(), obj.getMessage(), req.getDescription(false));
		return new ResponseEntity<>(err,HttpStatus.NOT_FOUND);
	

}
}

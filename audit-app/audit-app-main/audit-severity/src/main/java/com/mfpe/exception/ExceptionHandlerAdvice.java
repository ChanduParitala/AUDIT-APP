package com.mfpe.exception;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.mfpe.model.AuditResponse;

@ControllerAdvice
public class ExceptionHandlerAdvice {
	
	Logger logger = LoggerFactory.getLogger("Benchmark-Exception-Handler-Advice");
	
	// here it handles if any exception occurs during validation...
	// we we send a Invalid response to the Angular app if exception occurs
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<?> exception(Exception responseException) {
		//logger.error(responseException.getMessage()); 
		return new ResponseEntity<>(new AuditResponse(), HttpStatus.OK);
	}
}

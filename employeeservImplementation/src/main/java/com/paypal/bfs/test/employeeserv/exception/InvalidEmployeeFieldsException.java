package com.paypal.bfs.test.employeeserv.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.BAD_REQUEST, reason="Invalid details provided for Employees")
public class InvalidEmployeeFieldsException extends RuntimeException{
	
	public InvalidEmployeeFieldsException(String message) {
		super(message);
	}

}

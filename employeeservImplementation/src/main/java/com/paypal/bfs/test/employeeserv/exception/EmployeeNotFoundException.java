package com.paypal.bfs.test.employeeserv.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="Employee details not found")
public class EmployeeNotFoundException extends RuntimeException{
	
	public EmployeeNotFoundException(String id) {
		super("Employee Details not found for id : " + id);
	}

}

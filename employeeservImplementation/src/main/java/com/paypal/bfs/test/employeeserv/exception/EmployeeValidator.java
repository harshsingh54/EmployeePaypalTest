package com.paypal.bfs.test.employeeserv.exception;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.paypal.bfs.test.employeeserv.api.datamodel.Employee;

@Component("beforeCreateEmployeeValidator")
public class EmployeeValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return Employee.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		System.out.println("Inside Validation");
		Employee emp=(Employee)target;
		if(checkInputString(emp.getFirstName())) {
			errors.rejectValue("first_name", "first_name.empty");
		}
		if(checkInputString(emp.getLastName())) {
			errors.rejectValue("last_name", "last_name.empty");
		}
		if(checkInputString(emp.getDateOfBirth())) {
			errors.rejectValue("date_of_birth", "date_of_birth.empty");
		}
		if(emp.getAddress()!=null) {
			errors.rejectValue("address", "address.empty");
		}
		if(checkInputString(emp.getAddress().getLine1())) {
			errors.rejectValue("line1", "line1.empty");
		}
		if(checkInputString(emp.getAddress().getCity())) {
			errors.rejectValue("city", "city.empty");
		}
		if(checkInputString(emp.getAddress().getState())) {
			errors.rejectValue("state", "state.empty");
		}
		if(checkInputString(emp.getAddress().getZipCode())) {
			errors.rejectValue("zip_code", "zip_code.empty");
		}
		if(checkInputString(emp.getAddress().getCountry())) {
			errors.rejectValue("country", "country.empty");
		}
	}
	
	private boolean checkInputString(String input) {
        return (input == null || input.trim().length() == 0);
    }

}

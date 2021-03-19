package com.paypal.bfs.test.employeeserv.impl;

import com.paypal.bfs.test.employeeserv.api.EmployeeResource;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.paypal.bfs.test.employeeserv.api.datamodel.Employee;
import com.paypal.bfs.test.employeeserv.exception.InvalidEmployeeFieldsException;
import com.paypal.bfs.test.employeeserv.service.EmployeeService;



/**
 * Implementation class for employee resource.
 */
@RestController
public class EmployeeResourceImpl implements EmployeeResource {
	
	@Autowired
	EmployeeService empService;

    @Override
    public ResponseEntity<Employee> employeeGetById(String id) {

//        Employee employee = new Employee();
//        employee.setId(Integer.valueOf(id));
//        employee.setFirstName("BFS");
//        employee.setLastName("Developer");
    	
    	Employee employee =empService.getEmployeeById(id);

        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

	@Override
	public ResponseEntity<Integer> saveEmployee(@Valid @RequestBody Employee emp, Errors errors) {
		// TODO Auto-generated method stub
		if(errors.hasErrors()) {
			List<FieldError> fieldErrors=errors.getFieldErrors();
			StringBuilder sbError=new StringBuilder("Invalid Fields : ");
			for(FieldError error: fieldErrors) {
				sbError.append(" "+ error.getField()+",");
			}
			throw new InvalidEmployeeFieldsException(sbError.toString());
		}else {
		int id=empService.saveEmployee(emp);
		URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(id)
                .toUri();
		
		return ResponseEntity.created(location).body(id);
		}
	}
	
	
}

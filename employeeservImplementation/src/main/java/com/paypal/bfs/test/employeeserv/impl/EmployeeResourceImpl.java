package com.paypal.bfs.test.employeeserv.impl;

import com.paypal.bfs.test.employeeserv.api.EmployeeResource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import com.paypal.bfs.test.employeeserv.api.datamodel.Employee;
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
	public ResponseEntity<Integer> saveEmployee(Employee emp) {
		// TODO Auto-generated method stub
		int id=empService.saveEmployee(emp);
		return new ResponseEntity<>(id,HttpStatus.OK);
	}
}

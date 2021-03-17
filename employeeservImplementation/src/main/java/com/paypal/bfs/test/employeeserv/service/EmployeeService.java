package com.paypal.bfs.test.employeeserv.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.paypal.bfs.test.employeeserv.api.datamodel.Employee;
import com.paypal.bfs.test.employeeserv.repository.EmployeeRepository;

@Component
public class EmployeeService {
	
	@Autowired
	EmployeeRepository empRepository;
	
	public Employee getEmployeeById(String id) {
		Optional<Employee> empOpt=empRepository.findById(id);
		Employee emp=null;
		if(empOpt.isPresent()) {
			emp=empOpt.get();
		}
		return emp;
	}
	
	public int saveEmployee(Employee emp) {
		Employee result=empRepository.save(emp);
		return result.getId();
	}

}

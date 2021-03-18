package com.paypal.bfs.test.employeeserv;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.paypal.bfs.test.employeeserv.api.datamodel.Address;
import com.paypal.bfs.test.employeeserv.api.datamodel.Employee;
import com.paypal.bfs.test.employeeserv.repository.EmployeeRepository;

@SpringBootApplication
@EnableJpaRepositories
public class EmployeeservApplication {
    public static void main(String[] args) {
        SpringApplication.run(EmployeeservApplication.class, args);
    }
    
    public Employee createEmployee(String name, String lastName) {
    	Employee emp=new Employee();
    	emp.setFirstName(name);
    	emp.setLastName(lastName);
    	emp.setDateOfBirth("1994-10-05");
    	Address addr= new Address();
    	addr.setCity("Bengaluru");
    	addr.setLine1("House 45, Church Street");
    	addr.setLine2("MG Road");
    	addr.setState("KA");
    	addr.setZipCode("56001");
    	emp.setAddress(addr);
    	return emp;
    }
    
    @Bean
	  public CommandLineRunner demo(EmployeeRepository repository) {
    	return (args) -> {
  	      // save a few customers
  	      repository.save(createEmployee("BFS", "Developer"));
  	      System.out.println("-------------------------------");
  	      System.out.println("Employee Saved!");
    	};
    }
}
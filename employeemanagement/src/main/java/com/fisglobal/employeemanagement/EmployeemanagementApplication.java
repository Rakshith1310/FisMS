package com.fisglobal.employeemanagement;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

import com.fisglobal.employeemanagement.model.Employee;
import com.fisglobal.employeemanagement.repository.EmployeeRepository;

@SpringBootApplication
@EnableDiscoveryClient
public class EmployeemanagementApplication {

	public static void main(String[] args) {
	 ConfigurableApplicationContext context = SpringApplication.run(EmployeemanagementApplication.class, args);
		
		/*
		 * EmployeeRepository employeeRepository =
		 * context.getBean(EmployeeRepository.class); Employee employee1 = new
		 * Employee("ab001", "abhi", "chivate", 100.0f); Employee employee2 = new
		 * Employee("xy001", "abcc", "rao", 2999.0f); Employee employee3 = new
		 * Employee("xy002", "pqr", "pav", 3000.0f);
		 * 
		 * employeeRepository.save(employee1); employeeRepository.save(employee2);
		 * employeeRepository.save(employee3);
		 * 
		 * List<Employee> employees =employeeRepository.findAll();
		 * employees.forEach(System.out::println);
		 */
		  //context.close();
		 		 
	}

}

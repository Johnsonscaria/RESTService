package com.restservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restservice.model.Employee;
import com.restservice.service.EmployeeService;

/**
 * 
 * @author johnson
 *
 */
@RestController
public class RESTServiceController {

	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(path="/getAllEmployee",method=RequestMethod.POST)
	public List<Employee> retrieveAllEmployee(){
		System.out.println("retrieveAllStudent");
		List<Employee> employeeList = employeeService.retrieveAllEmployee();
		return employeeList;
	}

}

package com.restservice.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.restservice.model.Employee;
/**
 * 
 * @author johnson
 *
 */
@Component
public interface EmployeeService {

	List<Employee> retrieveAllEmployee();

}

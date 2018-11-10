package com.restservice.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.restservice.model.Employee;

/**
 * 
 * @author johnson
 *
 */
@Component
public interface EmployeeDAO {
	List<Employee> retrieveAllEmployee();
}


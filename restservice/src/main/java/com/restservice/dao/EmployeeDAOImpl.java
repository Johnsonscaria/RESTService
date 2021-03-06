package com.restservice.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.restservice.model.Employee;

/**
 * 
 * @author johnson
 *
 */
@Component
public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public List<Employee> retrieveAllEmployee() {
		List<Employee> employees = new ArrayList<>();
		Employee employee = new Employee();
		employee.setFirstName("Johnson");
		employee.setLastName("Johnson");
		employee.setDesgination("Team Lead");
		employee.setEmail("johnsonscaria@gmail.com");
		employees.add(employee);
		return employees;
	}

}

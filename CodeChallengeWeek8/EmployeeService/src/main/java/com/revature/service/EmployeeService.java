package com.revature.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.revature.beans.Employee;
import com.revature.dao.EmployeeRepository;

@Service
public class EmployeeService {

	private EmployeeRepository employeeRepository;
	
	public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	public List<Employee> getAllEmployees(){
		return this.employeeRepository.getAllEmployees();
	}
}

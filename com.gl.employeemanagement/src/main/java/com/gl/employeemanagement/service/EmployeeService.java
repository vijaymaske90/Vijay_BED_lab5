package com.gl.employeemanagement.service;

import java.util.List;

import com.gl.employeemanagement.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAllEmployees();
	
	public Employee findByEmployeeId(int employeeId);
	
	public void saveEmployee(Employee employee);
	
	public void deleteByEmployeeId(int employeeId);
	
	public List<Employee> searchEmployeeByFirstName(String name);
	
}

package com.gl.employeemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.employeemanagement.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	
}

package com.javainuse.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.javainuse.model.Employee;
@Component
public interface EmployeeService {
	List<Employee> getAllEmployees();
	void insertEmployee(Employee employee);
}
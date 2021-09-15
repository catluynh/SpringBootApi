package com.SpringBootapi.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.SpringBootapi.Entity.Employee;

public interface EmployeeService {
	public List<Employee> findAll();
	public Employee findById(int id);
	public void save(Employee employee);
	public void deleteById(int id);
}

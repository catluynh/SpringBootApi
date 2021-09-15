package com.SpringBootapi.Service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBootapi.Entity.Employee;
import com.SpringBootapi.Repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		Optional<Employee> result = employeeRepository.findById(id);
		Employee employee = null;
		if(result.isPresent()){
			employee = result.get();
		}
		else{
			throw new RuntimeException("Employee not find!");
		}
		return employee;
	}

	@Override
	public void save(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(id);
	}

}

package com.SpringBootapi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootapi.Entity.Employee;
import com.SpringBootapi.Service.EmployeeService;

@CrossOrigin
@RequestMapping("/api/employees")
@RestController
public class EmployeeRestController {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("")
	public List<Employee> findAll(){	
		return employeeService.findAll();
	}
	
	@GetMapping("/{id}")
	public Employee getEmployee(@PathVariable int id){
		Employee employee = employeeService.findById(id);
		return employee;
	}
	
	@PostMapping("")
	public Employee addEmployee(@RequestBody Employee employee) {
		employeeService.save(employee);
		return employee;	
	}
	
	@PutMapping("")
	public Employee updateEmployee(@RequestBody Employee employee) {
		employeeService.save(employee);
		return employee;	
	}
	
	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable int id){
		employeeService.deleteById(id);
	}
}

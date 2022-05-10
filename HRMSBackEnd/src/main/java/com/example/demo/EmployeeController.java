package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController 
{
	@Autowired
	EmployeeService employeeService;
	@GetMapping("/employees")
	List<Employee> getAll()
	{
		return employeeService.getAll();
	}
	@PostMapping("/addemployee")
	Employee save(@RequestBody Employee employee)
	{
		return employeeService.saveEmployee(employee);
	}
}

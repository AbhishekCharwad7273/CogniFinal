package com.example.H2Database.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.H2Database.Dao.EmployeeRepo;
import com.example.H2Database.Model.Employee;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepo employeeRepo;

	@PostMapping("/saveEmployee")
	public String saveEmp(@RequestBody Employee emp) {
		employeeRepo.save(emp);

		return "";

	}

	@GetMapping("/getAllEmployee")
	public List<Employee> getAllEmp() {
		return employeeRepo.findAll();

	}
	
	@GetMapping("/getEmployee/{department}")
	public List<Employee> getEmpByDept(@PathVariable String department)
	{
		return employeeRepo.findByDepartment(department);
	}
}

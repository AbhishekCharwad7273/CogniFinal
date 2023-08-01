package com.example.H2Database.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.H2Database.Model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

	List<Employee> findByDepartment(String department);

}

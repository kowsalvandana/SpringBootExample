package com.sree.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.sree.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
	
}

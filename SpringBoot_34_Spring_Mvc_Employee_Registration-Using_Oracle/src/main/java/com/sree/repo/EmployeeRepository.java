package com.sree.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sree.model.Employee;

public interface EmployeeRepository 
extends JpaRepository<Employee, Integer>
{

}
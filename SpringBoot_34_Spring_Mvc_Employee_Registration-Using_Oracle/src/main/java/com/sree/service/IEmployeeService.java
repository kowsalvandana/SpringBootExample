package com.sree.service;

import java.util.List;

import com.sree.model.Employee;

import java.util.Optional;

public interface IEmployeeService {

	/**
	 * Takes Reg Form data as input and returns PK generated
	 */
	public Integer saveEmployee(Employee e);
	
	/**
	 * Takes Edit Form data as input and returns PK generated
	 */
	public void updateEmployee(Employee e);
	
	/**
	 * Takes PK(ID) as input and perform delete operation
	 */
	void deleteEmployee(Integer id);
	
	
	/**
	 * Provide id as input and returns one row as one object
	 */
	Optional<Employee> getOneEmployee(Integer id);
	
	/**
	 * select all rows and give as List<Employee>
	 */
	List<Employee> getAllEmployees();
	
	/**
	 * Takes Id as input , if record exist true, else false
	 * 
	 */
	boolean isEmployeeExist(Integer id);
	
	
	

}


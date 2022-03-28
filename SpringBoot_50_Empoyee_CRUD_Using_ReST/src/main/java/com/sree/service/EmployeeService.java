package com.sree.service;

import java.util.List;
import java.util.Optional;

import com.sree.model.Employee;

public interface EmployeeService {
	public Integer saveStudent(Employee e);
	public void updateStudent(Employee e);
	public void deleteStudent(Integer eid);
	public Optional<Employee> getOneStudent(Integer eid);
	List<Employee>findAllStudents();
	public boolean isPresent(Integer eid);

}

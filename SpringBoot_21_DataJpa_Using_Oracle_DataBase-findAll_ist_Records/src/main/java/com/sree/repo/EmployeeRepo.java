package com.sree.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sree.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
	//SQL: select * from Employee where empId=102;
	List<Employee> findByEmpId(Integer empId);
	//SQL: select * from employee where empName="Vandu";
	List<Employee> findByEmpName(String empName);
	
}

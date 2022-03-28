package com.sree.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sree.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
	//SQL: select ename,esal from emptab where dept=?
	List<MyViewOne> findByEmpDept(String empDept);
	interface MyViewOne {
	String getEmpName();
	Integer getEmpId();
	String getEmpDept();
	double getsalary();
	}
	
	
}

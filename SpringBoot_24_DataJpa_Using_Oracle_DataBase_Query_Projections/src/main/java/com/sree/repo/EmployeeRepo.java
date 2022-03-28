package com.sree.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sree.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
	@Query(" FROM Employee e ")
	List<Employee> getMyData();
}

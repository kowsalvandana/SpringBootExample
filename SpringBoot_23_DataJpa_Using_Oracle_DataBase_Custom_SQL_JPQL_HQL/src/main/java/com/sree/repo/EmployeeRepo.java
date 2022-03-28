package com.sree.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sree.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
	/*SQL->HQL/JPQL
	tableName->className, columnName->variableName
	@Query("SELECT e FROM Employee e")
	List<Employee> getAllEmps();	*/
	@Query("SELECT e FROM Employee e WHERE e.empDept=?1")
	List<Employee> getEmpByDept(String a);
	//@Query("Select e empName,salary Employee e where e.empDept=?1 ")
//	List<Employee> getEmpByDept(String a);
	//@Query("SELECT * FROM Employee  WHERE r.EmpID=?2")

List<Employee> getEmpByempId(Integer i);
}
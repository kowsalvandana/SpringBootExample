package com.sree.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.sree.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
	@Transactional //commit/rollback
	@Modifying // update/delete (not select)
	@Query("delete from Employee e where e.empName=:empName")
	int removeDataByName(String empName);
	@Transactional
	@Modifying // update/delete (not select)
	@Query("DELETE FROM Employee e WHERE e.empName IS NULL")
	int removeNameIsNull();
	@Transactional
	@Modifying // update/delete (not select)
	@Query("UPDATE Employee e SET e.empName=:empName WHERE e.empId=:empId")
	int upateNameById(String empName,Integer empId);


}

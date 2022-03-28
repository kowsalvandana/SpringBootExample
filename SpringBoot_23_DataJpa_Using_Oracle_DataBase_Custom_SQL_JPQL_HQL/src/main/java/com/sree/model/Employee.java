package com.sree.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
@Entity

public class Employee {
	@Id
	private Integer empId;
	private String empName;
	private double salary;
	private String empDept;
	public Employee() {
		super();
		
		
	}
	public Employee(Integer empId, String empName, double salary, String empDept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.empDept = empDept;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", empdept=" + empDept
				+ "]";
	}
	
	

	
	

}

package com.sree.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data

public class Employee {

	private Integer empId;
	private String empName;
	private Double empSal;
	
	public Employee(Integer empId, String empName, Double empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	
}
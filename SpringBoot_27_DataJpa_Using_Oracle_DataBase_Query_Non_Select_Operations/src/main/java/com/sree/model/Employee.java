package com.sree.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {
	@Id
	@NonNull
	private Integer empId;
	private String empName;
	private Double empSal;
	private String empDept;
	public Employee(@NonNull Integer empId, String empName, Double empSal, String empDept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empDept = empDept;
	}
	
	
}

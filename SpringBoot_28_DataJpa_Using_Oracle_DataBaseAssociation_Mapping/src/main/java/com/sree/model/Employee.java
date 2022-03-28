package com.sree.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {
	@Id
	private Integer empId;
	private String empName;
	//HAS-A variable with Annotations
	@ManyToOne
	@JoinColumn(name="didFk")
	private Dept dob; //HAS-A
	public Employee() {
		super();
	}
	public Employee(Integer empId, String empName, Dept dob) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", dob=" + dob + "]";
	}
	
	}

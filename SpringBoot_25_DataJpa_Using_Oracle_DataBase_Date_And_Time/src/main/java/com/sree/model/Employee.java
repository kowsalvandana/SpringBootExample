package com.sree.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
	@Temporal(TemporalType.DATE)
	private Date dteA;
	@Temporal(TemporalType.TIME)
	private Date dteB;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dteC;
	public Employee() {
		super();
		
		
	}
	
	public Employee(Integer empId, String empName, double salary, String empDept, Date dteA, Date dteB, Date dteC) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.empDept = empDept;
		this.dteA = dteA;
		this.dteB = dteB;
		this.dteC = dteC;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", empDept=" + empDept
				+ ", dteA=" + dteA + ", dteB=" + dteB + ", dteC=" + dteC + "]";
	}

}

package com.sree.model;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
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
	@Lob
	private byte[] stdImg;
	@Lob
	private char[] stdDesc;
	public Employee() {
		super();
		
		}
	public Employee(Integer empId, String empName, double salary, String empDept, byte[] stdImg, char[] stdDesc) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.empDept = empDept;
		this.stdImg = stdImg;
		this.stdDesc = stdDesc;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", empDept=" + empDept
				+ ", stdImg=" + Arrays.toString(stdImg) + ", stdDesc=" + Arrays.toString(stdDesc) + "]";
	}
	
	


}

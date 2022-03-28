package com.sree.model;

import lombok.Data;

@Data
public class EmployeeModel {
	private int eid;
	private String ename;
	private double salary;
	public EmployeeModel(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	
	

}

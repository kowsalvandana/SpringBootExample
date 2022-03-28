package com.sree.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private Integer Sid;
	private String Sname;
	//private String Group;
	private String Year;
	private double Fee;
	

	public Student() {
		super();
	}


	public Student(Integer sid, String sname, String year, double fee) {
		super();
		Sid = sid;
		Sname = sname;
		Year = year;
		Fee = fee;
	}


	public Integer getSid() {
		return Sid;
	}


	public void setSid(Integer sid) {
		Sid = sid;
	}


	public String getSname() {
		return Sname;
	}


	public void setSname(String sname) {
		Sname = sname;
	}


	public String getYear() {
		return Year;
	}


	public void setYear(String year) {
		Year = year;
	}


	public double getFee() {
		return Fee;
	}


	public void setFee(double fee) {
		Fee = fee;
	}


	@Override
	public String toString() {
		return "Student [Sid=" + Sid + ", Sname=" + Sname + ", Year=" + Year + ", Fee=" + Fee + "]";
	}


}
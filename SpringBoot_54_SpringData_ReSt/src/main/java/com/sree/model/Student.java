package com.sree.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data

public class Student {
	
	@Id
	@GeneratedValue
	private Integer sid;
	private String sname;
	private double fee;
	
	public Student() {
		super();
	}

	public Student(Integer sid, String sname, double fee) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.fee = fee;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", fee=" + fee + "]";
	}
	
	

}

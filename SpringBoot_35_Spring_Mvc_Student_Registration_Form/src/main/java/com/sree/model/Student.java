package com.sree.model;

import lombok.Data;

@Data
public class Student {
	private int sid;
	private String sname;
	private double sfee;
	public Student(int sid, String sname, double sfee) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sfee = sfee;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sfee=" + sfee + "]";
	}

}

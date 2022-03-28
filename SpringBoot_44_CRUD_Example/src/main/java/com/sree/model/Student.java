package com.sree.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue
	private Integer sid;
	private String sname;
	private String Address;
	private String College;
	private double marks;
public Student() {
	super();
}
public Student(Integer sid, String sname, String address, String college, double marks) {
	super();
	this.sid = sid;
	this.sname = sname;
	Address = address;
	College = college;
	this.marks = marks;
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
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public String getCollege() {
	return College;
}
public void setCollege(String college) {
	College = college;
}
public double getMarks() {
	return marks;
}
public void setMarks(double marks) {
	this.marks = marks;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", Address=" + Address + ", College=" + College + ", marks="
			+ marks + "]";
}


}

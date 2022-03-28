package com.sree.model;

import java.util.List;

import lombok.Data;

@Data
public class Employee {
private int eid;
private String ename;
private String gender;
private String project;
private List<String> slot;
private String address;
public Employee() {
	super();
}
public Employee(int eid, String ename, String gender, String project, List<String> slot, String address) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.gender = gender;
	this.project = project;
	this.slot = slot;
	this.address = address;
}

public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getProject() {
	return project;
}
public void setProject(String project) {
	this.project = project;
}
public List<String> getSlot() {
	return slot;
}
public void setSlot(List<String> slot) {
	this.slot = slot;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", gender=" + gender + ", project=" + project + ", slot="
			+ slot + ", address=" + address + "]";
}
}

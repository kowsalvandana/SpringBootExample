package com.sree.model;

import java.util.List;
import java.util.Map;

public class Student {
private Integer sid;
private String sname;
private double marks;
private List<String> course;
private Map<String,String> result;
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
public double getMarks() {
	return marks;
}
public void setMarks(double marks) {
	this.marks = marks;
}
public List<String> getCourse() {
	return course;
}
public void setCourse(List<String> course) {
	this.course = course;
}
public Map<String, String> getResult() {
	return result;
}
public void setResult(Map<String, String> result) {
	this.result = result;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", marks=" + marks + ", course=" + course + ", result=" + result
			+ "]";
}


}
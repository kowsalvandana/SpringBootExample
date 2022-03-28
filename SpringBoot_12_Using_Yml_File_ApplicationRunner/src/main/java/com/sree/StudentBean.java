package com.sree;

import java.util.Map;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component
@ConfigurationProperties("my.student")
public class StudentBean {
	private int sid;
	private String name;
	private Set<String> course;
	private Map<String,Double> faculty_Fee;
	
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<String> getCourse() {
		return course;
	}
	public void setCourse(Set<String> course) {
		this.course = course;
	}
	public Map<String, Double> getFaculty_Fee() {
		return faculty_Fee;
	}
	public void setFaculty_Fee(Map<String, Double> faculty_Fee) {
		this.faculty_Fee = faculty_Fee;
	}
	@Override
	public String toString() {
		return "StudentBean [sid=" + sid + ", name=" + name + ", course=" + course + ", faculty_Fee=" + faculty_Fee
				+ "]";
	}
	
	
	
	
	
	

}

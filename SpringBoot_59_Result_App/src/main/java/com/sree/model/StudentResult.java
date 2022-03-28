package com.sree.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentResult {

	@Id
	private Integer sid;
	private String sname;
	private double Telugu;
	private double English;
	private double Civics;
	private double Economics;
	private double Commerce;
	
	public StudentResult() {
		super();
	}

	public StudentResult(Integer sid, String sname, double telugu, double english, double civics, double economics,
			double commerce) {
		super();
		this.sid = sid;
		this.sname = sname;
		Telugu = telugu;
		English = english;
		Civics = civics;
		Economics = economics;
		Commerce = commerce;
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

	public double getTelugu() {
		return Telugu;
	}

	public void setTelugu(double telugu) {
		Telugu = telugu;
	}

	public double getEnglish() {
		return English;
	}

	public void setEnglish(double english) {
		English = english;
	}

	public double getCivics() {
		return Civics;
	}

	public void setCivics(double civics) {
		Civics = civics;
	}

	public double getEconomics() {
		return Economics;
	}

	public void setEconomics(double economics) {
		Economics = economics;
	}

	public double getCommerce() {
		return Commerce;
	}

	public void setCommerce(double commerce) {
		Commerce = commerce;
	}

	@Override
	public String toString() {
		return "StudentResult [sid=" + sid + ", sname=" + sname + ", Telugu=" + Telugu + ", English=" + English
				+ ", Civics=" + Civics + ", Economics=" + Economics + ", Commerce=" + Commerce + "]";
	}
	
}

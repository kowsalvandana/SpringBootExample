package com.sree.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Lic {
	@Id
	private Long sid;
	private String name;
	private double premium;

public Lic() {
	super();
}

public Lic(Long sid, String name, double premium) {
	super();
	this.sid = sid;
	this.name = name;
	this.premium = premium;
}

public Long getSid() {
	return sid;
}

public void setSid(Long sid) {
	this.sid = sid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getPremium() {
	return premium;
}

public void setPremium(double premium) {
	this.premium = premium;
}

@Override
public String toString() {
	return "Lic [sid=" + sid + ", name=" + name + ", premium=" + premium + "]";
}
}
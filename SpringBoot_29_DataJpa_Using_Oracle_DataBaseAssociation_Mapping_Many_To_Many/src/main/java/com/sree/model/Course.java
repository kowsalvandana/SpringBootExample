package com.sree.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Course {
	@Id
	private Integer cid;
	private String cname;
	private Double cfee;
	public Course() {
		super();
	}
	public Course(Integer cid, String cname, Double cfee) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cfee = cfee;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", cfee=" + cfee + "]";
	}
	
}


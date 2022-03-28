package com.sree.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity

@NoArgsConstructor
@AllArgsConstructor
public class Product {
	@Id
	private Integer pid;
	private String pname;
	private double price;
	public Product() {
		super();
	}
	public Product(Integer pid, String pname, double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}
	
	

}

package com.sree.model;

import lombok.Data;

@Data
public class Product {
	private Integer id;
	private String name;
	private double cost;
	public Product(Integer id, String name, double cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", cost=" + cost + "]";
	}
	
	

}

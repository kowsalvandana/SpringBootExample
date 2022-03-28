package com.sree.model;

public class Customer {
	private String name;
	private String address;
	private Product pro;
	public Customer() {
		super();
	}
	public Customer(String name, String address, Product pro) {
		super();
		this.name = name;
		this.address = address;
		this.pro = pro;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Product getPro() {
		return pro;
	}
	public void setPro(Product pro) {
		this.pro = pro;
	}
	

}

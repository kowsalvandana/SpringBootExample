package com.sree;

import java.util.List;
import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component
@ConfigurationProperties("my.product")
public class Product implements CommandLineRunner{
	private int id;
	private String ProductName;
	private double cost;
	private List<String> Genaration;
	private Map<String,Double> Model;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getProductName() {
		return ProductName;
	}


	public void setProductName(String productName) {
		ProductName = productName;
	}


	public double getCost() {
		return cost;
	}


	public void setCost(double cost) {
		this.cost = cost;
	}


	public List<String> getGenaration() {
		return Genaration;
	}


	public void setGenaration(List<String> genaration) {
		Genaration = genaration;
	}


	public Map<String, Double> getModel() {
		return Model;
	}


	public void setModel(Map<String, Double> model) {
		Model = model;
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
		
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", ProductName=" + ProductName + ", cost=" + cost + ", Genaration=" + Genaration
				+ ", Model=" + Model + "]";
	}
	
}

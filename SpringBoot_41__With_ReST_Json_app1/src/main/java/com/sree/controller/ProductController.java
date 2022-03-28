package com.sree.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sree.model.Product;

@RestController
public class ProductController {
	
	@GetMapping("/a")
	public String showA() {
		return "WELCOME TO NARESH IT";
	}
	@GetMapping("/b")
	public Product showB() {
		return new Product(101,"laptop",25000.0);
	}
/*
	//3. List/Set Type
	@GetMapping("/c")
	public List<Product> showC() {
		return List.of(
				new Product(101,"A",400.0),
				new Product(102,"B",500.0),
				new Product(103,"C",600.0)
				);
		
	}*/
}

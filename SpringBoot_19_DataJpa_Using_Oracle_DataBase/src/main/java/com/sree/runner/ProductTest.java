package com.sree.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sree.model.Product;
import com.sree.repo.ProductRepo;
import com.sun.el.stream.Optional;

@Component

public class ProductTest implements CommandLineRunner {
@Autowired
private ProductRepo repo;
	@Override
	public void run(String... args) throws Exception {
	
	 
		repo.save(new Product(102,"TV",15000.0));
		repo.save(new Product(103,"Furniture",10000.0));
		repo.save(new Product(104,"Table",1500.0));
		repo.save(new Product(105,"Mobile",17000.0));
		
		/*repo.saveAll(
				Arrays.asList(
				new Product(101, "laptop", 250.0),
				new Product(102, "mobile", 350.0),
				new Product(103, "furniture", 280.0),
				new Product(104, "cable", 390.0)
				)
				);*/
		
		System.out.println("Select All Records");
		repo.findAll().forEach((System.out::println));
		 
	}
}

package com.sree.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.sree.model.Product;
import com.sree.repo.ProductRepo;
@Component
public class ProductRunner implements CommandLineRunner {
@Autowired
	private ProductRepo repo;
	@Override
	public void run(String... args) throws Exception {
		
repo.save(new Product(101,"pen",250));
repo.save(new Product(102,"Book",250));
repo.save(new Product(103,"mobile",250));

	}

}

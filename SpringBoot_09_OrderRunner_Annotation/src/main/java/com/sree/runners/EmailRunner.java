package com.sree.runners;


import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(8)
public class EmailRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("welcome to email runner");
		
	}


}

package com.sree.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
@Component
public class JdbcRunner implements CommandLineRunner, Ordered {

	@Override
	public int getOrder() {
		
		return -100;
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Welcome to jdbc runner");
	}

}

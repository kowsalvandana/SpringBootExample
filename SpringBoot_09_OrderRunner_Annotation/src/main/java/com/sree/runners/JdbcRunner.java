package com.sree.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component
@Order(1)
public class JdbcRunner implements CommandLineRunner{
	
@Override
public void run(String... args) throws Exception {
	System.out.println("Jdbc Runner");
}
}

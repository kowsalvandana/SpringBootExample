package com.sree;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Component
@Configuration
public class YmlExample implements CommandLineRunner {
   @Value("101")
	private int id;
   @Value("Sree")
	private String name;
	@Override
	public void run(String... args) throws Exception {
		
		
	}
	
	
	}



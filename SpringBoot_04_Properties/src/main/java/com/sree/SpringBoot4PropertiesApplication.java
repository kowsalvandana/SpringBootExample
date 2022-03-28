package com.sree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot4PropertiesApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringBoot4PropertiesApplication.class, args);
	DbCon con=ctx.getBean("c",DbCon.class);
	System.out.println(con);
	con.getDb();
	
	}

}

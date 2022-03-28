package com.sree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext; 
@SpringBootApplication
public class SpringBoot3AnnotationsApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringBoot3AnnotationsApplication.class, args);
		 DbConnection  con=ctx.getBean("c",DbConnection.class);
		System.out.println(con);
		
		System.out.println("Hello");
	}

}

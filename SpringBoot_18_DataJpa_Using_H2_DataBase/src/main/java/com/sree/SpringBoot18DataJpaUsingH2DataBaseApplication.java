package com.sree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.sree")
public class SpringBoot18DataJpaUsingH2DataBaseApplication {

	public static void main(String[] args) {
		System.out.println("inside SpringBoot18DataJpaUsingH2DataBaseApplication ");
		SpringApplication.run(SpringBoot18DataJpaUsingH2DataBaseApplication.class, args);
		System.out.println("end of SpringBoot18DataJpaUsingH2DataBaseApplication ");

	}

}

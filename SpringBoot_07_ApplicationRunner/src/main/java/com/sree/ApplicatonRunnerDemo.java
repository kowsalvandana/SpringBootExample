package com.sree;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
@Configuration
@Order(20)
public class ApplicatonRunnerDemo implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
	System.out.println("WELCOME APPLICATION RUNNER");

	}

}

package com.sree.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


import com.sree.repo.EmployeeRepo;
@Component
public class EmployeeTest implements CommandLineRunner {

		@Autowired
		private EmployeeRepo repo;
		public void run(String... args) throws Exception {
			int count = repo.removeDataByName("sree");
			//int count = repo.removeNameIsNull();
			int count1 = repo.upateNameById("ABCD", 101);
			System.out.println(count1);
			

		}
}

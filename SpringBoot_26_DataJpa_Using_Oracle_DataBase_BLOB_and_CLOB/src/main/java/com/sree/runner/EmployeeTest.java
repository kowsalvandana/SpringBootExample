package com.sree.runner;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;



import org.springframework.stereotype.Component;

import com.sree.model.Employee;

import com.sree.repo.EmployeeRepo;
@Component
public class EmployeeTest implements CommandLineRunner {
	@Autowired
private EmployeeRepo repo;
	@Override
	public void run(String... args) throws Exception {
		FileInputStream fis = new FileInputStream("F:\\New folder\\02.jpg");
		byte[] img = new byte[fis.available()];
		fis.read(img);
		String text="bdjbamfbabfafwefbjfvjvaejhevfjefagfhavhvfefj";
		char[] desc = text.toCharArray();
		
		repo.save(new Employee(101,"sree",1000.0,"Dev",img,desc));
		repo.findAll().forEach(System.out::println);
	}
	}



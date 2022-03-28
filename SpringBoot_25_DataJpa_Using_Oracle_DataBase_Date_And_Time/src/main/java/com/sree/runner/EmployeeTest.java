package com.sree.runner;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;



import org.springframework.stereotype.Component;

import com.sree.model.Employee;

import com.sree.repo.EmployeeRepo;



//import net.bytebuddy.asm.Advice.OffsetMapping.Sort;
@Component
public class EmployeeTest implements CommandLineRunner {
	@Autowired
private EmployeeRepo repo;
	@Override
	public void run(String... args) throws Exception {
		/*repo.save(
				new Employee(
				101, "A", 3.3,
				new Date(),
				new Date(),
				new Date()
				)
				);*/
		repo.save(new Employee(101,"sree",15000,"Dev",
				new Date(),
				new Date(),
				new Date()
				)
				);
		repo.save(new Employee(102,"Yammu",15000,"Dev",
				new Date(),
				new Date(),
				new Date()
				)
				);
		repo.save(new Employee(103,"Vandu",15000,"Dev",
				new Date(),
				new Date(),
				new Date()
				)
				);
		repo.findAll().forEach(System.out::println);
	}
	}



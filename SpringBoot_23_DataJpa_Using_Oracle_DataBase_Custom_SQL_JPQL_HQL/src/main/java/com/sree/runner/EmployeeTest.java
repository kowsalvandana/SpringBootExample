package com.sree.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
		repo.saveAll(
				Arrays.asList(
				new Employee(101, "Sree", 25000.0,"Devoloper"),
				new Employee(102, "Yammu", 20000.0,"Testing"),
				new Employee(103, "Vandu", 26000.0,"QA"),
				new Employee(104, "Swamy", 390000.0,"Analyst")
				)
				);
		//repo.getAllEmps().forEach(System.out::println);
		repo.getEmpByDept("Devoloper").forEach(System.out::println);
	
		//repo.getEmpByID(103).forEach(System.out::println);
		//repo.getEmpByempId(103).forEach(System.out::println);
		
	}
	}



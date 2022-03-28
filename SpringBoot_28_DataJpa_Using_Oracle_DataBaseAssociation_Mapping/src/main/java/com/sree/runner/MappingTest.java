package com.sree.runner;

import org.springframework.boot.CommandLineRunner;

import com.sree.model.Dept;
import com.sree.model.Employee;
import com.sree.repo.DeptRepo;
import com.sree.repo.EmployeeRepo;

public class MappingTest implements CommandLineRunner {
	private DeptRepo drepo;
	private EmployeeRepo erepo;

	@Override
	public void run(String... args) throws Exception {
		//1 row = 1 object
				Dept d1 = new Dept(101, "DEV");
				Dept d2 = new Dept(102, "QA");
				drepo.save(d1);
				drepo.save(d2);
				Employee e1 =  new Employee(5, "A", d1);
				Employee e2 =  new Employee(6, "B", d1);
				Employee e3 =  new Employee(7, "C", d2);
				Employee e4 =  new Employee(8, "D", d2);		
				erepo.save(e1);
				erepo.save(e2);
				erepo.save(e3);
				erepo.save(e4);
				System.out.println("---------------------");


	}

}

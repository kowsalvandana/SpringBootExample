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
				new Employee(101, "Sree", 250.0),
				new Employee(102, "Yammu", 350.0),
				new Employee(103, "Vandu", 280.0),
				new Employee(104, "Swamy", 390.0)
				)
				);
		//repo.deleteById(104);
		//System.out.println("Total Records="+repo.count());
		//repo.findAll(
			//	Sort.by("empName")
				//).forEach(System.out::println);;
				//repo.findAll(
				//Sort.by(Direction.DESC,"empName")
				//).forEach(System.out::println);
	//	Employee emp = new Employee();
		//emp.setEmpId(104);
		//repo.delete(emp); //object having PK
		//System.out.println("Select All Records");
		//repo.findAll().forEach((System.out::println));
		//repo.deleteAll();
		//repo.findAll().forEach(System.out::println);
		//System.out.println("-------------");
		//input for Pagination
		//pageNum,pageSize
		//Pageable pageable = PageRequest.of(6, 4);
		//execute and get output
		//Page<Employee> page = repo.findAll(pageable);
		//print data
		//List<Employee> list = page.getContent();
		//list.forEach(System.out::println);
		repo.findAll().forEach(System.out::println);
		System.out.println("-------------");
		//input for Pagination
		//pageNum,pageSize
		/*Pageable pageable = PageRequest.of(2, 3);
		//execute and get output
		Page<Employee> page = repo.findAll(pageable);
		//print data
		List<Employee> list = page.getContent(); //page data
		list.forEach(System.out::println);
		//---output details-------
		System.out.println("Page Has Data?"+page.hasContent()); //boolean
		System.out.println("First?"+page.isFirst()); //boolean
		System.out.println("Last?"+page.isLast()); //boolean
		System.out.println("Next?"+page.hasNext()); //boolean
		System.out.println("Prev?"+page.hasPrevious()); //boolean
		System.out.println("PageNumber?"+page.getNumber());
		System.out.println("Size?"+page.getSize()) ; //page size
		System.out.println("Total Pages?"+page.getTotalPages()) ; //Total Pages
		System.out.println("Total rows?"+page.getTotalElements()) ; //Total Rows
		System.out.println("Page Count?"+page.getContent().size()) ; //Total Rows*/
	}
}


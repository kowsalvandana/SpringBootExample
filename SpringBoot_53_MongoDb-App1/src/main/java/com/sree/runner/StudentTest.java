package com.sree.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sree.model.Student;
import com.sree.repo.StudentRepo;
@Component
public class StudentTest implements CommandLineRunner {

	@Autowired
	private StudentRepo repo;
	@Override
	public void run(String... args) throws Exception {
   repo.save(new Student("101","Sree",25000.0));
   repo.save(new Student("102","Yammu",20000.0));
   repo.save(new Student("103","Srinu",30000));
   repo.save(new Student("104","Shiva",26000));
   repo.save(new Student("105","Swamy",28000));
   System.out.println("====DONE=======");
    
	}

}

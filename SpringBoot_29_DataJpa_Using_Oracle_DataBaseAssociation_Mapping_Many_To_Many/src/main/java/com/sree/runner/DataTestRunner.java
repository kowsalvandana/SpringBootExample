package com.sree.runner;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sree.model.Course;
import com.sree.model.Student;
import com.sree.repo.CourseRepo;
import com.sree.repo.StudentRepo;


@Component
public class DataTestRunner implements CommandLineRunner {
	@Autowired
	private CourseRepo crepo;
	@Autowired
	private StudentRepo srepo;
	@Override
	public void run(String... args) throws Exception {
		Course c1 = new Course(101, "CJ", 200.0);
		Course c2 = new Course(102, "BOOT", 300.0);
		Course c3 = new Course(103, "MS", 400.0);
		
		crepo.save(c1);
		crepo.save(c2);
		crepo.save(c3);
		//parent objects with child obj links
		Student s1= new Student(5, "A");
		Student s2= new Student(6, "B");
		Student s3= new Student(7, "C");
		srepo.save(s1);
		srepo.save(s2);
		srepo.save(s3);

	}
}
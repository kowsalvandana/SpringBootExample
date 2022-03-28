package com.sree.student;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.sree.StudentBean;
@Component
public class Student implements ApplicationRunner {
	@Autowired
	private StudentBean std;
@Override
public void run(ApplicationArguments args) throws Exception {
	System.out.println(Arrays.asList(std));
	
}
}

package com.sree.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sree.model.Student;
import com.sree.repo.StudentRepo;
@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentRepo repo;

	@Override
	public Integer saveStudent(Student s) {
		
		return repo.save(s).getSid();
	}

	


		
		
	 

	
}

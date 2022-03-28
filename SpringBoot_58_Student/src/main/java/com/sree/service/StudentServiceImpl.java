package com.sree.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sree.model.Student;
import com.sree.repo.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepo repo;

	@Override
	public Integer SaveStudent(Student s) {
	
		return repo.save(s).getSid();
	}

	@Override
	public List<Student> AllStudents() {
		
		return repo.findAll();
	}

	@Override
	public Student getOneStudent(Integer sid) {
		// TODO Auto-generated method stub
		return repo.getStudentBysid(sid);
	}

	




}

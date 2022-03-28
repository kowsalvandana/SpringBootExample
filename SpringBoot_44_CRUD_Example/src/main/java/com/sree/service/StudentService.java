package com.sree.service;

import java.util.List;

import com.sree.model.Student;

public interface StudentService {

	Integer saveStudent(Student s);
	void updateStudent(Student s);
	void deleteStudent(Integer sid);
	Student getOneStudent(Integer sid);
	List<Student> getAllStudents();
	boolean existStudent(Integer sid);
	
	
	
}


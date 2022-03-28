package com.sree.service;

import java.util.List;
import java.util.Optional;

import com.sree.model.Student;

public interface StudentService {
	public Integer saveStudent(Student s);
	public void updateStudent(Student s);
	public void deleteStudent(Integer sid);
	Optional <Student>getOneStudent(Integer sid);
	List<Student>findAllStudents();
	public boolean isPresent(Integer sid);

}

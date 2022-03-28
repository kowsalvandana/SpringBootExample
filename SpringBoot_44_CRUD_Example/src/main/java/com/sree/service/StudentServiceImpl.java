package com.sree.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sree.exception.StudentNotFoundException;

import com.sree.model.Student;
import com.sree.repo.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
private StudentRepo repo;
	@Override
	public Integer saveStudent(Student s) {
		
		return repo.save(s).getSid();
	}

	@Override
	public void updateStudent(Student s) {
		repo.save(s);

	}

	@Override
	public void deleteStudent(Integer sid) {
		repo.deleteById(sid);
	}

	@Override
	public Student getOneStudent(Integer sid) {
		Student p = repo.findById(sid)
				.orElseThrow(
						()->
						new StudentNotFoundException("Student '"+sid+"' Not exist")
						);
		return p;
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public boolean existStudent(Integer sid) {
		// TODO Auto-generated method stub
		return repo.existsById(sid);
	}

}

package com.sree.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	public Optional<Student> getOneStudent(Integer sid) {
		
		return repo.findById(sid);
	}

	@Override
	public List<Student> findAllStudents() {

		return repo.findAll();
	}

	@Override
	public boolean isPresent(Integer sid) {
		
		return repo.existsById(sid);
	}

}

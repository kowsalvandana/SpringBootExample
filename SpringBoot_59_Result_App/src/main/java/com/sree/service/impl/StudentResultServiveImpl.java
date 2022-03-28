package com.sree.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sree.model.StudentResult;
import com.sree.repo.StudentResultRepo;
import com.sree.service.StudentService;

@Service
public class StudentResultServiveImpl implements StudentService {
	
	@Autowired
	private StudentResultRepo repo;

	@Override
	public StudentResult getOneStudentResults(Integer sid) {
		
		return repo.getStudentResult(sid);
	}

}

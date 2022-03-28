package com.sree.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sree.model.StudentResult;

public interface StudentResultRepo extends JpaRepository<StudentResult,Integer>{
	StudentResult getStudentResult(Integer sid);

}

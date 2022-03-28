package com.sree.repo;

import com.sree.model.Student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer>{

}

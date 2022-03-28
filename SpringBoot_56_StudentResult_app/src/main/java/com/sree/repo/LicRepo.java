package com.sree.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sree.model.Student;



public interface LicRepo extends JpaRepository<Student,Integer> {

Student getLicByPolicynumber(Integer Student);
}

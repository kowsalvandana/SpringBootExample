package com.sree.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sree.model.Course;

public interface CourseRepo extends JpaRepository<Course,Integer> {

}

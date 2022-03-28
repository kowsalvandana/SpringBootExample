package com.sree.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sree.model.Student;

public interface StudentRepo extends MongoRepository<Student, String> {
}

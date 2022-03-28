package com.sree.service;

import java.util.List;


import com.sree.model.Student;

public interface StudentService {
public Integer SaveStudent(Student s);
public List<Student> AllStudents();
public Student getOneStudent(Integer sid);

}

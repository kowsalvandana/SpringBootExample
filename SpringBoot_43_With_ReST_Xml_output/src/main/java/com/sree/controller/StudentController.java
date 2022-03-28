package com.sree.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sree.model.Student;

@RestController
public class StudentController {
@PostMapping("/s")
public String saveStd(@RequestBody Student student) {
		return student.toString();
	}
}
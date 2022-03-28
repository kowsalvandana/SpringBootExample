package com.sree.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sree.model.Student;

@RestController
public class StudentRestController {
	@PostMapping("/s")
	public String readData(@RequestBody Student student) {
		return student.toString();
		
	}

}

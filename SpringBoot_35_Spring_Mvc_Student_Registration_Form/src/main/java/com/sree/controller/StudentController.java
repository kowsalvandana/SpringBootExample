package com.sree.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sree.model.Student;

@Controller
public class StudentController {
	//1. Show Register Page
	@GetMapping("/reg")
	public String stuReg() {
		return "StudentReg";
	}
	//2. Read form data
	@GetMapping("/save")
//	@PostMapping("/save")
	public String save(
			//read data from Container
			@ModelAttribute Student student,Model m) {
		//send data to UI again
		m.addAttribute("std",student);
		return "StudentData";
	}

}

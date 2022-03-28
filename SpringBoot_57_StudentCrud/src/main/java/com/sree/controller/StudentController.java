package com.sree.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.sree.model.Student;
import com.sree.service.StudentService;

@Controller
@RequestMapping("/std")
public class StudentController {
	@Autowired
	private StudentService service;
	
	
	
	@GetMapping("/reg")
	public String showMsg(Model map) {
		map.addAttribute("std",new Student());
		return "Reg";
	}
	@PostMapping("/save")
	public String Save(@ModelAttribute Student std,Model map) {
		Integer sid=service.saveStudent(std);
		map.addAttribute("mrg",sid);
		map.addAttribute("std",new Student());
		return "wel";
		
	}
	
}

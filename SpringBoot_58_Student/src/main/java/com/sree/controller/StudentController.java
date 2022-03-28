package com.sree.controller;

import java.util.List;

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
	@GetMapping("/thankyou")
	public String tq() {
		return "thankyou";
	}
	@GetMapping("/find")
	public String find() {
		return "search";
	}
	
	
	@GetMapping("/reg")
	public String StudentReg(Model m) {
		m.addAttribute("student",new Student());
		return "Reg";
	}
	@PostMapping("/save")
	public String StudentSave(@ModelAttribute Student student,Model m) {
		Integer sid=service.SaveStudent(student);
	   m.addAttribute("msg",new Student());
		return "redirect:thankyou";
		
	}
	@GetMapping("/show")
	public String GetAllStudents(Model m) {
		List<Student> std=service.AllStudents();
		m.addAttribute("std",std);
		return "data";
	}
	@GetMapping("/search")
	public String viewOne(@RequestParam Integer sid,Model map)throws Exception{
		String status="";
		Student s=service.getOneStudent(sid);
		if(s==null) {
			status= "nodata";
		}
		else {
			
		map.addAttribute("s",s);
		status="view";
	
		}
		return status;
	}

	
}

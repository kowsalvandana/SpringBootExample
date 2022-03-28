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
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService service;
	@GetMapping("/register")
	public String showStudent(Model m) {
		m.addAttribute("student",new Student());
		
		return "std";
		
		}
@PostMapping("/save")
public String saveStudent(@ModelAttribute Student student,Model m) {
	Integer sid=service.saveStudent(student);
	m.addAttribute("message", "Student '"+sid+"' Saved");
	m.addAttribute("student",new Student());
	return "std";
}
@GetMapping("/all")
public String showAll(Model model) {
	List<Student> list = service.getAllStudents();
	model.addAttribute("list", list);
	return "data";
}
@GetMapping("/delete")
public String delete(
		@RequestParam Integer sid,
		Model model) 
{
	service.deleteStudent(sid);
	model.addAttribute("list", service.getAllStudents());
	model.addAttribute("message", "Product '"+sid+"' Deleted");
	return "Data";
}
@GetMapping("/edit")
public String showEdit(
		@RequestParam Integer sid,
		Model model) 
{
	// send object data to form data
	model.addAttribute("student",service.getOneStudent(sid));
	return "Edit";
}
@PostMapping("/update")
public String update(
		@ModelAttribute Student student,
		Model model) 
{
	service.updateStudent(student);
	model.addAttribute("list", service.getAllStudents());
	model.addAttribute("message", "Student '"+student.getSid()+"' Updated");
	return "Data";
}


	
}










package com.sree.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sree.model.Employee;

@Controller
public class EmployeeController {

	//1. Show Register Page
	@GetMapping("/register")
	public String showReg() {
		return "EmployeeReg";
	}
	
	//2. Read form data
	//@RequestMapping(value = "/save",method = RequestMethod.POST)
	@PostMapping("/save")
	public String readData(
			//read data from Container
			@ModelAttribute Employee employee,
			Model model)
	{
		//System.out.println(employee);
		//send data to UI again
		model.addAttribute("emp", employee);
		return "EmpData";
	}
	
}

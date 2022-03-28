package com.sree.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sree.model.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@GetMapping("/reg")
	public String ShowRegister(Model m) {
		Employee e=new Employee();
		m.addAttribute("employee",e);
		return "empReg";
	}
	@PostMapping("/save")
	public String ShowData(@ModelAttribute Employee employee,Model map) {

		map.addAttribute("eob", employee);
		return "empData";
		
	}

}

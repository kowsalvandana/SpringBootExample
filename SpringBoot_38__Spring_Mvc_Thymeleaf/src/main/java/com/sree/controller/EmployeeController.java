package com.sree.controller;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sree.model.Employee;



@Controller
public class EmployeeController {

	@GetMapping("/show")
	public String showEmp(Model model) {
		model.addAttribute("code", "NareshIT");
		model.addAttribute("emp", new Employee(101, "AMIT", 65000.0));
		
		//model.addAttribute("list", List.of("A","B","C"));
		return "EmpHome";
	}


}

package com.sree;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class Employee {
	//******************** Using Model *************************************************
   @GetMapping("/emp")
	public String showEmp(Model m) {
	m.addAttribute("eid",101);
	 m.addAttribute("ename","sree");
	 m.addAttribute("salary",15000.0);
	 
	  return "emp";
	 }
	 }
	//********************** Using ModelAndView  ********************************	   
		  
	/*@GetMapping("/emp")
	public ModelAndView emp() {
		ModelAndView view=new ModelAndView();
		view.setViewName("emp");
		view.addObject("eid",101);
		view.addObject("ename","sree");
		view.addObject("salary",25000.0);
		
		return view;
	}

	**************************** Using ModelMap ********************************************
	
@GetMapping("/emp")
public String ShwoEmp(ModelMap m) {
	m.addAttribute("eid",101);
	m.addAttribute("ename","sree");
	m.addAttribute("salary",2800.0);
	return "emp";
}*/



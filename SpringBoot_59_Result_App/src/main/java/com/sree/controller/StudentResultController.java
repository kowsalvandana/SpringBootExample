package com.sree.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sree.model.StudentResult;
import com.sree.service.StudentService;

@Controller
public class StudentResultController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/serchform")
     public String SearchForm() {
		return "search";
	}
	@GetMapping("/search")
	public String result(@RequestParam Integer sid,Model map)throws Exception {
		String status="";
		StudentResult sr=service.getOneStudentResults(sid);
		if(sr==null) {
			status="nodata";
		}
		else {
			map.addAttribute("s",sr);
			status="view";
		}
		return status;
	}
}

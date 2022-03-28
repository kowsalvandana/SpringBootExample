package com.sree.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sree.model.Student;
import com.sree.service.LicService;
@Controller
@RequestMapping("/lic")
public class TestController {
	@Autowired
	private LicService service;
	
	@GetMapping("/searchform")
	public String showsearchform() {
		return "searchform";
	}
	
	
	@GetMapping("/search")
	public String viewOne(@RequestParam Integer sid,Model map)throws Exception{
		String status="";
		Student l=service.getOneLicHolders(sid);
		if(l==null) {
			status= "nodata";
		}
		else {
			
		map.addAttribute("l",l);
		status="view";
	
		}
		return status;
	}
	
	}
	



package com.sree.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sree.model.Lic;
import com.sree.model.Validations;
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
	public String viewOne(@RequestParam Long sid,Model map)throws Exception{
		String status="";
		Lic l=service.getOneLicHolders(sid);
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
	



package com.sree;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Naresh_It {
	@RequestMapping(value="/naresh",method=RequestMethod.GET)
	public String Naresh() {
		return "redirect:course";
	}
	@RequestMapping("/course")
	public String Course() {
		return "course";
	}
	

}

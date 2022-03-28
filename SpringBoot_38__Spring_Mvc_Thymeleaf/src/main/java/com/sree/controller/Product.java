package com.sree.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class Product{

	@GetMapping("/index")
	public String showIndex() {
		return "IndexPage";
	}
	
	@GetMapping("/message")
	public String showMessage() {
		return "MessagePage";
	}
}


package com.sree;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Employee {
	@RequestMapping("show")
public String Show() {
	return "home";
}
}

package com.sree.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.sree.model.Product;

@Controller
public class ProductModel {
	@GetMapping("/reg")
	public String ProductReg() {
		return "reg";
	}
	@GetMapping("/save")
	public String Product(@ModelAttribute Product p,Model m) {
		m.addAttribute("prod",p);
		return "data";
	}

}

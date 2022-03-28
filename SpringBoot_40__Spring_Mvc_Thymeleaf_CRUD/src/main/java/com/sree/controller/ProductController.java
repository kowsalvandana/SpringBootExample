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

import com.sree.model.Product;
import com.sree.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService service;
	@GetMapping("/register")
	public String showReg(Model map) {
		map.addAttribute("product",new Product());
		return "Reg";
	}
@PostMapping("/save")
	public String saveProduct(@ModelAttribute Product product,Model map) {
	Integer pid=service.saveProduct(product);
	map.addAttribute("message", "Product '"+pid+"' Saved");
	map.addAttribute("product",new Product());
	
		return "Reg";
	}
@GetMapping("/all")
public String showAll(Model model) {
	List<Product> list = service.getAllProducts();
	model.addAttribute("list", list);
	return "Data";
}
@GetMapping("/delete")
public String delete(
		@RequestParam Integer pid,
		Model model) 
{
	service.deleteProduct(pid);
	model.addAttribute("list", service.getAllProducts());
	model.addAttribute("message", "Product '"+pid+"' Deleted");
	return "Data";
}
@GetMapping("/edit")
public String showEdit(
		@RequestParam Integer pid,
		Model model) 
{
	// send object data to form data
	model.addAttribute("product",service.getOneProduct(pid));
	return "Edit";
}
@PostMapping("/update")
public String update(
		@ModelAttribute Product product,
		Model model) 
{
	service.updateProduct(product);
	model.addAttribute("list", service.getAllProducts());
	model.addAttribute("message", "Product '"+product.getPid()+"' Updated");
	return "Data";
}


	
}

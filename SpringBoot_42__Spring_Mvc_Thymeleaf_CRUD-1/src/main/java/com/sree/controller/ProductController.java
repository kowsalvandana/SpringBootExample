package com.sree.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sree.model.Customer;
import com.sree.model.Product;

@RestController
public class ProductController {
	
	@GetMapping("/a")
	public String ShowA() {
		return "WELCOME TO NARESH IT ";
		
	}
	@GetMapping("/b")
	public Product showB() {
		return new Product(101,"LapTop",25000.00);
				
	}
	@GetMapping("/c")
	public List<Product> showC(){
		return List.of( new Product(101,"loptop",25000.00),
				        new Product(102,"CPU",15000.00),
				        new Product(103,"KeyBoard",2000.00),
				        new Product(104,"Mouse",500.00));
				}
	@GetMapping("/d")
    public Map<String,String> showD(){
    	return Map.of(
    			"p1","ABC",
    			"P2","YXE",
    			"P3","XYZ"
    			);
    }
	@GetMapping("/e")
	public Map<String,Product> showE(){
		return Map.of(
				"p1",new Product(101,"loptop",25000.0),
				"p2",new Product(102,"Mobile",20000.0),
				"p3",new Product(103,"CPU",10000.0)
				
				);
				
				}
	
       @GetMapping("/f")
       public Customer ShowE() {
    	   return new Customer(
    			   "Sree",
    			   "Hyd",
    			   new Product(101,"loptop",25000.0)
    			   );
       }
}

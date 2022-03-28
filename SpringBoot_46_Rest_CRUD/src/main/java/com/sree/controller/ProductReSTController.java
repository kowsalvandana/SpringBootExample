package com.sree.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sree.exception.ProductNotFoundException;
import com.sree.model.Product;
import com.sree.service.ProductServiceImpl;
@RestController
@RequestMapping("/rest/product")


@CrossOrigin(origins = "http://localhost:4200")

public class ProductReSTController {
	@Autowired
	private ProductServiceImpl service;
	@PostMapping("/save")
	public ResponseEntity<String> saveProduct(
			@RequestBody Product product) 
	{
		ResponseEntity<String> resp = null;
		try {
			Integer pid = service.saveProduct(product);
			resp = new ResponseEntity<String>(
					"Product '"+pid+"' Created", 
					HttpStatus.CREATED); //201-Created
		} catch (Exception e) {
			e.printStackTrace();
			resp = new ResponseEntity<String>(
					"Unable to save Product", 
					HttpStatus.INTERNAL_SERVER_ERROR); //500-ISE
		}
		return resp;
	}
	@GetMapping("/all")
	public ResponseEntity<?> getAllProducts() {
		ResponseEntity<?> resp = null;
		try {
			List<Product> list =  service.getAllProducts();
			resp = new ResponseEntity<List<Product>>(
					list,
					HttpStatus.OK);//200-OK
		} catch (Exception e) {
			resp = new ResponseEntity<String>(
					"Unable to save Product", 
					HttpStatus.INTERNAL_SERVER_ERROR); //500-ISE
		}
		return resp;
	}
	@GetMapping("/find/{pid}")
	public ResponseEntity<?> getOneProduct(
			@PathVariable Integer pid
			)
	{
		ResponseEntity<?> resp = null;
		try {
			Product product = service.getOneProduct(pid);
			resp = new ResponseEntity<Product>(
							product, 
							HttpStatus.OK);
		} catch(ProductNotFoundException  pne) {
			throw pne; // re-throw exception
		} catch (Exception e) {
			e.printStackTrace();
			resp = new ResponseEntity<String>(
					"Unable to find Product", 
					HttpStatus.INTERNAL_SERVER_ERROR); //500-ISE
		}  
		return resp;
	}
	@DeleteMapping("/remove/{pid}")
	public ResponseEntity<String> deleteProduct(
			@PathVariable Integer pid
			) 
	{
		ResponseEntity<String> resp = null;
		try {
			service.deleteProduct(pid);
			resp = new ResponseEntity<String>(
					"Product '"+pid+"' deleted", HttpStatus.OK);
		} catch(ProductNotFoundException pne) {
			throw pne; // re-throw exception to handler
		} catch (Exception e) {
			e.printStackTrace();
			resp = new ResponseEntity<String>(
					"Unable to Delete Product", 
					HttpStatus.INTERNAL_SERVER_ERROR); //500-ISE
		}

		return resp;
	}

}

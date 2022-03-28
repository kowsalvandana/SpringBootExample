package com.sree.service;

import java.util.List;

import com.sree.model.Product;

public interface ProductService {
	Integer saveProduct(Product p);
	void updateProduct(Product p);
	void deleteProduct(Integer pid);
	Product getOneProduct(Integer pid);
	List<Product> getAllProducts();

}

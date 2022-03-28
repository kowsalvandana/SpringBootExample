package com.sree.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sree.exception.ProductNotFoundException;
import com.sree.model.Product;
import com.sree.repo.ProductRepo;
@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepo repo;

	@Override
	public Integer saveProduct(Product p) {
		
		return repo.save(p).getPid();
	}

	@Override
	public void updateProduct(Product p) {
		repo.save(p);
	}

	@Override
	public void deleteProduct(Integer pid) {

		Product p=getOneProduct(pid);
		repo.delete(p);

	}

	@Override
	public Product getOneProduct(Integer pid) {
		Product p = repo.findById(pid)
				.orElseThrow(()-> new ProductNotFoundException(
						new StringBuffer()
						.append("Product '")
						.append(pid)
						.append("' not exist")
						.toString())
						);
				return p;
			}


	@Override
	public List<Product> getAllProducts() {
		List<Product> list = repo.findAll();
		list.sort(
				(p1,p2) -> 
				p1.getPid().compareTo(p2.getPid())
				);
		return list;
	}

}

package com.sree.service;

import java.util.List;
import java.util.Optional;

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
		Product p= getOneProduct(pid);
		repo.delete(p);

	}

	@Override
	public Product getOneProduct(Integer pid) {
		/*Optional<Product> opt = repo.findById(id);
		if(opt.isPresent())
			return opt.get();
		else
			throw new ProductNotFoundException("Product '"+id+"' Not exist");
		 */
		Product p = repo.findById(pid)
				.orElseThrow(
						()->
						new ProductNotFoundException("Product '"+pid+"' Not exist")
						);
		return p;
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public boolean existProduct(Integer pid) {
		// TODO Auto-generated method stub
		return repo.existsById(pid);
	}

}

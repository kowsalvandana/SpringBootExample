package com.sree.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sree.model.Product;

public interface ProductRepo extends JpaRepository<Product,Integer> {

}

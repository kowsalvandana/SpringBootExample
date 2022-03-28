package com.sree.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sree.model.Book;

public interface BookRepo extends JpaRepository<Book,String>{

}

package com.sree.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.sree.model.Book;
import com.sree.repo.BookRepo;

public class BookTest implements CommandLineRunner {
	@Autowired
	private BookRepo repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repo.save(new Book("Telugu","sree","kk",
				Arrays.asList("A1","A2"),new String[] {"A","b","c"}
				
				
				
				));
		

	}

}

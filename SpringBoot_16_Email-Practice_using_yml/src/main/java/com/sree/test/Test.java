package com.sree.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.FileSystemResource;

import com.sree.utilityMainl.EmailPractice;

public class Test implements CommandLineRunner {
	@Autowired
	private EmailPractice email;

	@Override
	public void run(String... args) throws Exception {
		FileSystemResource file=new FileSystemResource("F:\\New folder\\main.jpg");
		boolean sent = email.send(
				"ksri66520@gmail.com",
				new String[] {
						
						
						
				}, 
				new String[] {
						
						"yamunamudhiraj0@gmail.com",
						
				}, 
				"HELLO", 
				"WELCOME", 
				file);

		if(sent) {
			System.out.println("Email sent succesfully");
		}else {
			System.out.println("Email not sent succesfully");
		}
		
	}

}

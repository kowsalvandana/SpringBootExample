package com.sree.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Component;

import com.sree.service.NitEmailService;



@Component
public class MailTestRunner implements CommandLineRunner {
	@Autowired
	private NitEmailService nes;
	
	@Override
	public void run(String... args) throws Exception {
		FileSystemResource file = 
				new FileSystemResource("F:\\New folder\\02.jpg");
		boolean sent = nes.send(
				"ksri66520@gmail.com ",
				new String[] {
						
						"ksri66520@gmail.com",
						"ksri66518@gmail.com",
						"ksri66517@gmail.com",
						
						
				}, 
				new String[] {
						"yamunamudhiraj0@gmail.com",
						"shivakumarkanuku1@gmail.com"
						
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
package com.sree.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailPractice {
	@Autowired
	private JavaMailSender sender;
	public boolean send(String to,String[] cc,String[] bcc,String subject,String Text,FileSystemResource file) {
		boolean status=false;
		try {
	}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return status ;

	}	
}

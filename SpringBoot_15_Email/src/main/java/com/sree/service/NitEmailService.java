package com.sree.service;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class NitEmailService {
	
	@Autowired
	private JavaMailSender sender; //HAS-A
	
	public boolean send(
			String to,
			String[] cc,
			String[] bcc,
			String subject,
			String text,
			FileSystemResource  file
			) 
	{
		boolean status = false;
		try {
			//1. create empty message / new message
			MimeMessage message = sender.createMimeMessage();
			
			//2. take helper object
			//true-allocate memory for attachment
			//false-do not waste memory, no attachment
			//if file!=null - means file exist
			MimeMessageHelper helper = new MimeMessageHelper(
					message, file!=null?true:false);           
			
			//3. provide details to message
			helper.setTo(to);
			helper.setSubject(subject);
			if(cc!=null) //cc is optional in email
				helper.setCc(cc);
			if(bcc!=null)
				helper.setBcc(bcc); //it is also optional
			
			helper.setText(text);
			
			if(file!=null) {
				helper.addAttachment(file.getFilename(), file);
			}
			
			//4. send message
			sender.send(message);
			status = true;
		} catch (Exception e) {
			status=false;
			e.printStackTrace();
		}
		return status;
	}
}

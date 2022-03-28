package com.sree.utilityMainl;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.MailSender;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmailPractice {
	@Autowired
	private JavaMailSender sender;
	public  boolean send(String to,String[] cc,String[] bcc,String subject,String text,FileSystemResource file) {
		boolean status=false;
		try {
			// 1.create mime message object
			MimeMessage message=sender.createMimeMessage();
			// 2.create helper object
			MimeMessageHelper helper=new MimeMessageHelper(message,file!=null?true:false);
			//  3.setDetails
			helper.setTo(to);
			
			if(cc!=null) 
				helper.setCc(cc);
		   if(bcc!=null)
			   helper.setBcc(bcc);
		   helper.setSubject(subject);
		   helper.setText(text);
			if(file!=null)
		
		
		//4. send message
		sender.send(message);
		status = true;
	} 
		catch (Exception e) {
		status=false;
		e.printStackTrace();
	}
	return status;
}
}

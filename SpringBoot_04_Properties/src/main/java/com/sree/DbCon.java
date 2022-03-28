package com.sree;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@Component("c")
//@PropertySource("classpath:sree.properties") if we want to change properties file name then we should write like 
//this other wise we should get exception ex:sree.properties
public class DbCon {
	@Value("${db.driver}")
	private String driver;
	@Value("${db.url}")
	private String url;
	@Value("${db.name}")
	private String username;
	@Value("${db.password}")
	private String password;
	
	public void getDb() {
		System.out.println(driver);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
	}
	

}

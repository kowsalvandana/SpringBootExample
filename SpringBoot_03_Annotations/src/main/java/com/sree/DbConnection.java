package com.sree;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("c")
public class DbConnection {
	
	@Value("oracle.jdbc.OracleDriver")
	private String Driver;
	@Value("jdbc:oracle:thin:@localhost:1521:xe")
	private String url;
	@Value("system")
	private String username;
	@Value("system")
	private String password;
	
}

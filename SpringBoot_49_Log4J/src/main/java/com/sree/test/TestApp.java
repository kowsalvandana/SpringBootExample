package com.sree.test;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.xml.XMLLayout;


public class TestApp {
	private static Logger log=Logger.getLogger(TestApp.class);
	public static void main(String[] args)throws Exception {
	     //Layout layout=new HTMLLayout();
		//Layout layout=new SimpleLayout();
	   //Layout layout=new XMLLayout();
	  //Layout layout=new PatternLayout("%d{dd-MMM-yyy HH:mm:ss SSS}");
		//Layout layout=new HTMLLayout();
	//Appender apender=new FileAppender(layout,"F:\\sree\\my.log");
	//log.addAppender(apender);
	log.debug("From debug");
	log.info("From Info");
	log.error("From Error");
	log.warn("From Warn");
	log.fatal("From Fatal");
	System.out.println("Done");
}
}

/*
 
 package com.sree.camel;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
@Component
public class MyCamel extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		//from("file:F:\\sree").to("file:F:\\yammu");
		from("{{my.sree}}").to("{{my.yammu}})");
	}

}

 */

package com.sree.camel;

import java.util.StringTokenizer;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
@Component
public class EmployeeCamel extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file:F:/sree").process(new Processor() {
			
			@Override
			public void process(Exchange exchange) throws Exception {
				// read input message given by source
				Message input=exchange.getIn();
				//read body as String from Input message
				String data=input.getBody(String.class);
				//Operation
				StringTokenizer str= new StringTokenizer(data,",");
				String eid=str.nextToken();
				String ename=str.nextToken();
				String sal=str.nextToken();
				String dataModified="{eid:"+eid+"ename:"+ename+"sal:"+sal+"}";
				Message output=exchange.getOut();
				output.setBody(dataModified);
				
			}
		}).to("file:F:/yammu?fileName=emp.xml");

	}

}

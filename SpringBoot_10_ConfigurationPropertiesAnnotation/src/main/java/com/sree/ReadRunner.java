package com.sree;

import java.util.Arrays;
import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("my.app")
@Component
public class ReadRunner implements CommandLineRunner {
private int id;
private String code;
private double version;
private String[] info;
private Map<String,String> course;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
	
		}
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getCode() {
		return code;
	}



	public void setCode(String code) {
		this.code = code;
	}



	public double getVersion() {
		return version;
	}



	public void setVersion(double version) {
		this.version = version;
	}



	public String[] getInfo() {
		return info;
	}



	public void setInfo(String[] info) {
		this.info = info;
	}



	public Map<String, String> getCourse() {
		return course;
	}



	public void setCourse(Map<String, String> course) {
		this.course = course;
	}



	@Override
	public String toString() {
		return "ReadRunner [id=" + id + ", code=" + code + ", version=" + version + ", info=" + Arrays.toString(info)
				+ ", course=" + course + "]";
	}



	
	
}

	
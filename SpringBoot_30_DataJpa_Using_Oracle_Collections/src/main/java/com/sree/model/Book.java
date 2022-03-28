package com.sree.model;

import java.util.Arrays;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity

public class Book {
	@Id
private String id;
private String BookName;
private String BookAuth;
private List<String> codes;
private String[] grades;

public Book() {
	super();
}

public Book(String id, String bookName, String bookAuth, List<String> codes, String[] grades) {
	super();
	this.id = id;
	BookName = bookName;
	BookAuth = bookAuth;
	this.codes = codes;
	this.grades = grades;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getBookName() {
	return BookName;
}

public void setBookName(String bookName) {
	BookName = bookName;
}

public String getBookAuth() {
	return BookAuth;
}

public void setBookAuth(String bookAuth) {
	BookAuth = bookAuth;
}

public List<String> getCodes() {
	return codes;
}

public void setCodes(List<String> codes) {
	this.codes = codes;
}

public String[] getGrades() {
	return grades;
}

public void setGrades(String[] grades) {
	this.grades = grades;
}

@Override
public String toString() {
	return "Book [id=" + id + ", BookName=" + BookName + ", BookAuth=" + BookAuth + ", codes=" + codes + ", grades="
			+ Arrays.toString(grades) + "]";
}

}

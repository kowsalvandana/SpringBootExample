package com.sree.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sree.model.Student;
import com.sree.service.StudentService;

import lombok.Delegate;



@RestController
@RequestMapping("/tkr/students")
public class StudentRestController {
	@Autowired
	private StudentService service;
	
	//STUDENT RECORD IS SAVED 
	@PostMapping("/save")
public ResponseEntity<String> save(@RequestBody Student student){
	ResponseEntity<String> resp=null;
	try {
		Integer sid=service.saveStudent(student);
		resp=new ResponseEntity<String>("Student'"+sid+"'created",HttpStatus.OK);
	}
	catch(Exception e) {
		resp=new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		e.printStackTrace();
		
	}
	return resp;
}
	//GET ALL STUDENTS
	@GetMapping("/all")
	public ResponseEntity<?> getAll(){
		ResponseEntity<?> resp=null;
		List<Student> list=service.findAllStudents();
		if(list==null|| list.isEmpty()){
			String message="No Data Found";
			resp=new ResponseEntity<String>(message,HttpStatus.OK);
		}
		else {
			resp=new ResponseEntity<List<Student>>(list,HttpStatus.OK);
		}
		return resp;
	}
	@DeleteMapping("/delete/{sid}")
	public ResponseEntity<String> deleteStudent(@PathVariable Integer sid){
		ResponseEntity<String> resp=null;
		boolean present=service.isPresent(sid);
		if(present) {
			service.deleteStudent(sid);
			resp=new ResponseEntity<String>("deleted'"+sid+"'successfully",HttpStatus.OK);
		}
		else {
			resp=new ResponseEntity<String>("'"+sid+"'Not exist",HttpStatus.BAD_REQUEST);
		}
		return resp;
	}
@PutMapping("/update")
public ResponseEntity<String> updateStudent(@RequestBody Student student){
	ResponseEntity<String> resp=null;

	boolean present=service.isPresent(student.getSid());
	if(present) {
		service.updateStudent(student);
		resp=new ResponseEntity<String>("updated successfully",HttpStatus.OK);
	}
	else {
		resp=new ResponseEntity<String>("Record '"+student.getSid()+"'not exist",HttpStatus.BAD_REQUEST);
		
	}
	return resp;








}
	}

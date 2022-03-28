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

import com.sree.model.Employee;
import com.sree.service.EmployeeService;

@RestController
@RequestMapping("/rest/employee")
public class EmployeeRestController {
	@Autowired
	private EmployeeService service;
	
	@PostMapping("/save")
	public ResponseEntity<String> save(@RequestBody Employee employee){
		ResponseEntity<String> resp=null;
		try {
			Integer eid=service.saveStudent(employee);
			resp=new ResponseEntity<String>("Student'"+eid+"'created",HttpStatus.OK);
		}
		catch(Exception e) {
			resp=new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}
		return resp;
	}
	@GetMapping("/all")
	public ResponseEntity<?> getAll(){
		ResponseEntity<?>resp=null;
		
			List<Employee> list=service.findAllStudents();
			if(list==null||list.isEmpty()) {
				String message="No Data Found";
			resp=new ResponseEntity<String>(message,HttpStatus.OK);
		}
			else {
				resp=new ResponseEntity<List<Employee>>(list,HttpStatus.OK);
			}
			return resp;
		
	}
	@DeleteMapping("/delete/{eid}")
	public ResponseEntity<String> delete(@PathVariable Integer eid){
		ResponseEntity<String> resp=null;
		boolean present=service.isPresent(eid);
		if(present) {
		service.deleteStudent(eid);
		resp=new ResponseEntity<String>("Student'"+eid+"'deleted",HttpStatus.OK);
	}
	else {
		resp=new ResponseEntity<String>("Student'"+eid+"'not exist",HttpStatus.BAD_REQUEST);
	}
	
	return resp;
	
	}

@PutMapping("/update")
public ResponseEntity<String> update(@RequestBody Employee employee){
	ResponseEntity<String> resp=null;
	boolean present=service.isPresent(employee.getEid());
	if(present) {
	service.updateStudent(employee);
	resp=new ResponseEntity<String>("Updated successfuly",HttpStatus.OK);
}
else {
	resp=new ResponseEntity<String>("Record not exist",HttpStatus.BAD_REQUEST);
}

return resp;

}
	}
package com.sree.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sree.model.Employee;
import com.sree.service.IEmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private IEmployeeService service; //HAS-A

	/**
	 * 1. Show Employee Register Page
	 * 
	 */
	@GetMapping("/register")
	public String showReg() {
		return "EmpReg";
	}
	
	
	/*** 2. On click submit (Register) 
	 * read form data and save in db.
	 * Send success message to UI
	 */
	@PostMapping("/save")
	public String saveEmployee(
			@ModelAttribute Employee employee, //reading form data
			Model model  //send data from controller to UI
			) 
	{
		//save employee using service
		Integer id = service.saveEmployee(employee);
		
		//construct success messsage
		String message = "Employee '"+id+"' Saved";
		//send message to UI
		model.addAttribute("message", message);
		
		// return UI PageName
		return "EmpReg";
	}
	/**
	 * 3. Display all rows as 
	 *     HTML Form at UI
	
	*/
	@GetMapping("/all")
	public String showEmployees(Model model) 
	{
		// fetching data using service
		List<Employee> list = service.getAllEmployees();
		// sending data to UI
		model.addAttribute("list", list);
		return "EmpData";
	}

	 
	 /* 4. Create Delete HyperLink
	 * and delete based id params
	 */
	
	@GetMapping("/delete")
	public String deleteEmployee(
			@RequestParam Integer id,
			Model model) 
	{
		if(service.isEmployeeExist(id)) {
			service.deleteEmployee(id);
		}
		
		// fetching data using service
		List<Employee> list = service.getAllEmployees();
		// sending data to UI
		model.addAttribute("list", list);
		model.addAttribute("message", "Employe '"+id+"' deleted");
		return "EmpData";
		//return "redirect:all";
	}

	/**
	 * 5. Show Edit Page on click Edit Link
	 *    with form data
	 */
	
	@GetMapping("/edit")
	public String showEmployeeEdit(
				@RequestParam Integer id,
				Model model
			) 
	{
		String page = null;
		// JDK 1.8 - Optional - Handle null value
		//make service call to get data
		Optional<Employee> opt = service.getOneEmployee(id);
		if(opt.isPresent()) { //if given id exist in db
			//read object
			Employee  emp = opt.get();
			
			//send to UI as Form object
			model.addAttribute("list",emp);
			
			page = "EmpEdit";
		} else {
			//given id not exist in db
			page = "redirect:all";
		}
		return page;
	}
	/**
	 * 6. Perform Update opertation
	 *     on click Update form.
	 *     Read form data and update in DB
	 *     
	 */
	
	
}
package com.sree.controller;



import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.sree.model.Lic;
import com.sree.model.Validations;
import com.sree.service.LicService;
@Controller
@RequestMapping("/lic")
public class LicController {
	@Autowired
	private LicService service;
	//additional code
	@GetMapping("/welcome")
	public String showIndex() {
		return "Welcome";
	}
	@GetMapping("/home")
	public String showhome() {
		return "home";
	}
	@GetMapping("/footer")
	public String showfooter() {
		return "footer";
	}

	@GetMapping("/header")
	public String showheader() {
		return "header";
	}
	@GetMapping("/main")
	public String showmain() {
		return "main";
	}
	@GetMapping("/success")
	public String showsuccess() {
		return "success";
	}
	@GetMapping("/searchform")
	public String showsearchform() {
		return "searchform";
	}
    @GetMapping("/reg") 
	public String Show(Model map) {
		map.addAttribute("lic",new Lic());

		return "Registration"; }
     @PostMapping("/save") 
	public String saveLic(@ModelAttribute Lic lic,Model
			map) { 
		   Long policynumber=service.saveLicHolders(lic);
			map.addAttribute("message","Lic '"+policynumber+"'registered");
			map.addAttribute("lic",new Lic()); 
			return "redirect:success"; }
     @GetMapping("/all")
	public String showAll(Model model) {
		List<Lic> list = service.getAllLicHolders();
		model.addAttribute("list", list);
		return "Data";
	}
    @GetMapping("/search")
	public String viewOne(@RequestParam Long policynumber,Model map)throws Exception{
		String status="";
		Lic l=service.getOneLicHolders(policynumber);
		if(l==null) {
			status= "nodata";
		}
		else {

			map.addAttribute("l",l);
			status="view";

		}
		return status;
	}
    @GetMapping("/delete")
public String deleteLicHolder(@RequestParam Long policynumber,Model map) {
	service.deleteLicHolder(policynumber);
	//map.addAttribute("l",service.getAllLicHolders());
    //map.addAttribute("l",service.getAllLicHolders());
	//map.addAttribute("l", "Lic '"+policynumber+"' Updated");
	return "redirect:all";
}

    @GetMapping("/edit")
    public String editLic(@RequestParam Long policynumber,Model map) {
    	map.addAttribute("lic",service.getOneLicHolders(policynumber));
    	return "edit";
    	
    }
    
    @PostMapping("/update")
    public String updateLicHolder(@ModelAttribute Lic lic,Model map) {
    	service.updateLicHolders(lic);
    	//map.addAttribute("l",service.getAllLicHolders());
    	//map.addAttribute("lic", "Lic '"+lic.getPolicynumber()+"' Updated");
    	return "redirect:all";
    	
    }
}



package com.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dao.EmployeeRepository;
import com.entity.EmployeeEntity;

@Controller

public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@GetMapping("/")
	String displayDefaultPage(){
		
		return "nav";
		
	}
	
	
	@GetMapping("/register")
	String displayRegistrationPage(){
		
		return "registration";
		
	}
	
	
	@GetMapping("/login")
	String displayLoginPage(){
		
		return "emp-login";
		
	}
	
	@PostMapping("/register")
	String doRegistration(@ModelAttribute EmployeeEntity employeeEntity){
		
		System.out.println(employeeEntity);
		
		employeeRepository.save(employeeEntity);
		
		return "registration";
		
	}

	@PostMapping("/login")
	String doLogin(@RequestParam String email,@RequestParam String password,Model model ) {
		EmployeeEntity employeeEntity=employeeRepository.findByEmailAndPassword(email,password);
		if(employeeEntity !=null) {
			model.addAttribute("employeeEntity",employeeEntity );
			return "congrates";
		}
		else { //invalid credential
			
			model.addAttribute("loginMsg", "Invalid credential..plz try again");
			return "emp-login";
			
		}
		
		
	}

	@GetMapping("/showAll")
	String displayAllEmployees(Model model){
		List<EmployeeEntity> listOfEmployeeEntity=employeeRepository.findAll();
		
		model.addAttribute("listOfEmployeeEntity",listOfEmployeeEntity );
		
		return "showAll";//showAll.jsp
		
	}
	@GetMapping("/delEmp")
	String deleteEmployee(@RequestParam  int employeeId){
		
		employeeRepository.deleteById(employeeId);
		//fetch all fresh records and display to showAll.jsp
		
		return "redirect:showAll";//will call line 73
		
	}
	@GetMapping("/editEmp")
	String editEmployee(@RequestParam  int employeeId,Model model){
		Optional<EmployeeEntity> optional=employeeRepository.findById(employeeId);
		if(optional.isPresent()) {
			
			EmployeeEntity employeeEntity=optional.get();
			model.addAttribute("employeeEntity",employeeEntity);
			return "edit";
		}
		
		model.addAttribute("msg","no record found");
		return "edit";
		
	}
	
	@PostMapping("/updateEmployee")
	String updateEmp(@ModelAttribute EmployeeEntity employeeEntity){
		
		employeeRepository.save(employeeEntity);
		return "redirect:showAll";
		
	}

}

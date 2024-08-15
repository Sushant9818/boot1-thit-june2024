package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyTestController {
	
	@GetMapping("/hi")
	String displayHelloPage(){
		
		return "hello";//hello.jsp
		
	}
	
	@GetMapping("/loginpage")
	String displayLoginPage(){
		
		return "login";//login.jsp
		
	}
	
	@GetMapping("/addpage")
	String displayAddPage(){
		
		return "add";//add.jsp
		
	}	
	
	@GetMapping("/doAdd")
	String displayAddPage(@RequestParam int no1,@RequestParam int no2 , Model model){
		int sum=no1+no2;
		
		model.addAttribute("sum", sum);
		
		return "add";//add.jsp
		
	}	
	
	
	

}

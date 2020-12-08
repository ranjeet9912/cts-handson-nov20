package com.example.springbootproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MyController {
	@PostMapping
	public Employee addEmployee() {
		return null;
		
	}
	
	@GetMapping
	public <Employee> getEmployee(){
		return null;
	}
	

}

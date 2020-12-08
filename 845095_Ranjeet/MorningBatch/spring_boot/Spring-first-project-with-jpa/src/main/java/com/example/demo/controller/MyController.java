package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.service.MyService;


@RestController
public class MyController {

	@Autowired
	MyService service;
	@RequestMapping
	
	//Post mapping for adding the new record in the database
	@PostMapping("/add")
	public Customer addcus(Customer customer) {
		System.out.println("add customer is calling");
		return service.addCustomer(customer);
		
		
	}
	@GetMapping("/get")
	public List<Customer> fathchCus(){
		System.out.println("all record is calling");
		return service.AllData();
		
	}
	@GetMapping("/byid/{id}")
	public Optional<Customer> Byid(@PathVariable Long id) {
		return service.ById(id);
	}
	@GetMapping("/byName/{name}")
		public Optional<Customer> byname(@PathVariable String name){
			return service.byname(name);
		}
		
	

}

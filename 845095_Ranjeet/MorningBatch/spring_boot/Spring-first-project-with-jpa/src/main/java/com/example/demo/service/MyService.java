package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.repository.MyRepository;
@Service
public class MyService {
	@Autowired
	MyRepository repo;

	public Customer addCustomer(Customer customer) {
		repo.save(customer);
		return null;
	}



	public List<Customer> AllData() {
		// TODO Auto-generated method stub
		System.out.println("in service");
		return repo.findAll();
	}



	public Optional<Customer> ById(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}



	


	public Optional<Customer> byname(String name) {
		// TODO Auto-generated method stub
		return repo.findByName(name);
	}

	


}
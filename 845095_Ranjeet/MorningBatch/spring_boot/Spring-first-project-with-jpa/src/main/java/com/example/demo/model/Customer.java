package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	private Long id;
	private String name;
	private String lastName;
	private double balance;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", lastName=" + lastName + ", balance=" + balance + "]";
	}
	public Customer(Long id, String name, String lastName, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.balance = balance;
	}
	

}

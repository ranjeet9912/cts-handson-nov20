package com.example.springbootproject;

import java.time.LocalDate;

public class Employee {
	
	private int EmpId;
	private String Name;
	private double Salary;
    private LocalDate Dob;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String name, double salary, LocalDate dob) {
		super();
		EmpId = empId;
		Name = name;
		Salary = salary;
		Dob = dob;
	}
	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", Name=" + Name + ", Salary=" + Salary + ", Dob=" + Dob + "]";
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public LocalDate getDob() {
		return Dob;
	}
	public void setDob(LocalDate dob) {
		Dob = dob;
	}	

}

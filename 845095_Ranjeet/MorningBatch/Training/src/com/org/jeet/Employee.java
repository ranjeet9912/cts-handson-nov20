package com.org.jeet;

public class Employee {
 private int id;
 private String Name;
 public Employee(int id, String name, int salary) {
	super();
	this.id = id;
	Name = name;
	Salary = salary;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", Name=" + Name + ", Salary=" + Salary + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getSalary() {
	return Salary;
}
public void setSalary(int salary) {
	Salary = salary;
}
private int Salary;
}

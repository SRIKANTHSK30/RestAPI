package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
@Id
private int id;
private String EmployeeName;
private int EmployeeAge;
private long Salary;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEmployeeName() {
	return EmployeeName;
}
public void setEmployeeName(String employeeName) {
	EmployeeName = employeeName;
}
public int getEmployeeAge() {
	return EmployeeAge;
}
public void setEmployeeAge(int employeeAge) {
	EmployeeAge = employeeAge;
}
public long getSalary() {
	return Salary;
}
public void setSalary(long salary) {
	Salary = salary;
}
}
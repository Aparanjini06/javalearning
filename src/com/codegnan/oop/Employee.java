package com.codegnan.oop;

public class Employee {
	String name;
	double basicSalary;
	public void setDetails(String n, double salary) {
		name=n;
		basicSalary=salary;
	}
	public double calculateHRA() {
		return 0.20*basicSalary;
	}
	public double calculateDA() {
		return 0.10*basicSalary;
	}
	public double grossSalary() {
		return basicSalary+calculateHRA()+calculateDA();
	}
}

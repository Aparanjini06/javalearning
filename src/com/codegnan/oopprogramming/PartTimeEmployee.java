package com.codegnan.oopprogramming;

public class PartTimeEmployee extends Employee1{
	double hourlyRate;
	int hoursWorked;
	public PartTimeEmployee(String name,double hourlyRate,int hoursWorked) {
		super(name);
		this.hourlyRate=hourlyRate;
		this.hoursWorked=hoursWorked;
		
	}
	@Override
	public double calculateSalary() {
		return hourlyRate*hoursWorked;
	}
	
	
}

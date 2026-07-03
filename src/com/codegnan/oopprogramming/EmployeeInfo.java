package com.codegnan.oopprogramming;

import java.util.Scanner;

public class EmployeeInfo extends Employee{
	double salaryPerYear;
	public EmployeeInfo() {
		super("","",0);
	}
	public void inputEmployeeDetails() {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Employee Name: ");
		employeeName=s.nextLine();
		System.out.print("Enter Employee Designation");
		designation=s.nextLine();
		System.out.print("Enter Years of Experience :");
		yearsOfExperience=s.nextInt();
		System.out.println("Enter Salary per year : ");
		salaryPerYear=s.nextDouble();
		s.close();
	}
	public void displayEmployeeInfo() {
		System.out.println("Employee Name: "+employeeName);
		System.out.println("Designation: "+designation);
		System.out.println("Years of Experience : "+yearsOfExperience+" years");
		
	}
	public void calculateSalary() {
		double salary =yearsOfExperience* salaryPerYear;
		System.out.println("Salary $ "+salary);
	}

	
}

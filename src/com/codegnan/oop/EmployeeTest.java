package com.codegnan.oop;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setDetails("aparanjini", 20000);
		//double grossSalary=e.grossSalary();
		System.out.println("Employee Name: "+e.name);
		System.out.println("Employee Basic salary: "+e.basicSalary);
		System.out.println("HRA Allowance: "+e.calculateHRA());
		System.out.println("DA Allowance: "+e.calculateDA());
		System.out.println("Gross Salaray: "+e.grossSalary());
		
	}

}

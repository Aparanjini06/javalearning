package com.codegnan.oop;

public class Employee1Test {

	public static void main(String[] args) {
		Employee1 emp = new Employee1(102, "aparanjini", 20000);
		emp.displayDetails();
		
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
		emp.setId(101);
		emp.setName("appu");
		emp.setSalary(20000);
		
	}

}

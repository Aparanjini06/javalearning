package com.codegnan.oopprogramming;

public class Employee1Test {

	public static void main(String[] args) {
		Employee1 emp=new FullTimeEmployee("appu", 20000);
		Employee1 emp2=new PartTimeEmployee("jaya", 2500, 75);
		Employee1 emp3=new ContractEmployee("poornima",2000000);
		emp.display();
		System.out.println("salary: "+emp.calculateSalary());
		emp2.display();
		System.out.println("Salary:"+emp2.calculateSalary());
		emp3.display();
		System.out.println("Salary: "+emp3.calculateSalary());
	}

}

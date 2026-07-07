package com.codegnan.collections;

import java.util.ArrayList;
import java.util.Collection;

public class EmployeeDemo {
	public static void main(String[] args) {
		Collection<Employee> emp=new ArrayList<>();
		System.out.println();;
		emp.add(new Employee(111,"appu",200000,"hyd"));
		emp.add(new Employee(222,"srujana",300000,"vsp"));
		emp.add(new Employee(333,"prantha",250000,"hyd"));
		System.out.println(emp);
 		
	}
}

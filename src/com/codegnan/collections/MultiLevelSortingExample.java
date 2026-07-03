package com.codegnan.collections;

import java.util.TreeSet;

public class MultiLevelSortingExample {
	public static void main(String[] args) {
		TreeSet<Employee> t=new TreeSet<>(new SalaryNameDepartmentComparator());
		t.add(new Employee(999,"malli",17000,"hyd"));
		t.add(new Employee(666,"arjun",1000,"bng"));
		t.add(new Employee(111,"neha",22000,"vjy"));
		t.add(new Employee(333,"sneha",55000,"mumbai"));
		t.add(new Employee(777,"raji",22000,"hyd"));
		for(Employee e:t)    
		{
			System.out.println(e);
		}
	}
}

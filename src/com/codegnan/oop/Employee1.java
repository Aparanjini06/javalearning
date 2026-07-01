package com.codegnan.oop;

public class Employee1 {
	private int id;
	String name;
	double salary;

	public void displayDetails() {
		System.out.println("Employee Id: " + id);
		System.out.println("Employee Name: " + name);
		System.out.println("Employee salary: " + salary);

	}

	public Employee1(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id < 0) {
			System.out.println("Invalid ID");
			System.exit(0);
		} else {
			this.id = id;
		}
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {
		if (name == null || name.equals("")) {
			System.out.println("Inalid name");
			System.exit(0);
		} else {
			this.name = name;
		}
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if (salary < 0) {
			System.out.println("Invalid salary");
			System.exit(0);
		} else {
			this.salary = salary;
		}

	}
}

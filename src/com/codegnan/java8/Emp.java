package com.codegnan.java8;

public class Emp {
	private int id;
	private String name;
	private String department;
	private int Salary;
	private String city;
	public Emp(int id, String name, String department, int salary, String city) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		Salary = salary;
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", department=" + department + ", Salary=" + Salary + ", city="
				+ city + "]";
	}
	
}

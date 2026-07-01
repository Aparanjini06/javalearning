package com.codegnan.oop;

import java.util.Scanner;

public class Car {
	private String model;
	private int year;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Car(String model, int year) {
		super();
		this.model = model;
		this.year = year;
	}
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		String model=s.next();
		int year=s.nextInt();
		Car c1=new Car(model,year);
		c1.setModel(model);
		c1.setYear(year);
		System.out.println("Model :"+c1.getModel());
		System.out.println("year: "+c1.getYear());
		s.close();
		
	}

}

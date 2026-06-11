package com.codegnan.oop;

public class Book {
	int id;
	String type;
	public Book(int id) {
		super();
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public Book(int id, String type) {
		super();
		this.id = id;
		this.type = type;
	}
	public int claculateFine(int days)
	{
		int fine=days*5;
		if(fine>=1000)
		{
			fine=1000;
		}
		return fine;
	}
	public int calculateFine(int days,String type) {
		int fine=0;
		if(type.equalsIgnoreCase("regular")) {//Regular
			fine=days*2;
		}
		else {
			if(type.equalsIgnoreCase("premium")) {
			fine=days*3;
			}
		}
		if(fine>=1000)
		{
			fine=1000;
		}
		return fine;
	}
	public int calculateFine(int days,int fixedCost) {
		
		int fine=days*5+fixedCost;
		if(fine>=1000)
		{
			fine=1000;
		}
		return fine;
	}
	
	
}

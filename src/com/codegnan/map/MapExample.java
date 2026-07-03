package com.codegnan.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		HashMap<Person,Integer>h=new HashMap<>();
		h.put(new Person(1,"malli","arjun@gmail.com"),666);
		h.put(new Person(7,"arjun","malli@gmail.com"),666);
		h.put(new Person(5,"neha","sneha@gmail.com"),666);
		h.put(new Person(3,"mounika","mounika@gmail.com"),666);
		System.out.println(h);
		HashMap<Person,Integer>h1=new HashMap<>();
		System.out.println("Printing LinkedHashMap entities One by one");
		
		
		
		
	}
}

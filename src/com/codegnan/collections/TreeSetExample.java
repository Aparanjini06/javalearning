package com.codegnan.collections;

import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Person> t=new TreeSet<>(new PersonComparator());
		t.add(new Person(102,"Charlie","charlie@gmail.com"));
		t.add(new Person(101,"Alice","alice@gmail.com"));
		t.add(new Person(103,"Bob","bob@gmail.com"));
		System.out.println(t);
		for(Person p:t)
		{
			System.out.println(p);
		}
	}
}

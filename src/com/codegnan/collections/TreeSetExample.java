package com.codegnan.collections;

import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<String> t=new TreeSet<>(new MyComparator());
		t.add("Roja");
		t.add("ShobaRani");
		t.add("RajaKumari");
		t.add("Ramulamma");
		System.out.println(t);
	}
}

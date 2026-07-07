package com.codegnan.java8;

import java.util.function.Predicate;

public class EvenOdd {
	public static void main(String[] args) {
		Predicate<Integer>p=a->a%2==0;
		System.out.println(p.test(20));
		System.out.println(p.test(61));
 	}
}

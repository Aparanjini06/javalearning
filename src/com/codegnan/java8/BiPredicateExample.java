package com.codegnan.java8;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateExample {
	public static void main(String[] args) {
		BiPredicate<Integer,Integer>isEvenSum=(a,b)->(a+b)%2==0;
		System.out.println(isEvenSum.test(10, 20));
		System.out.println(isEvenSum.test(25, 26));
		
		BiPredicate<String,String>isEqual=(a,b)->a.equalsIgnoreCase(b);
		System.out.println(isEqual.test("appu", "Appu"));
		
		BiFunction<Double,Double,Double> totalPrice=(price1,price2)->price1+price2;
		System.out.println(totalPrice.apply(20.0, 30.0));
		
			
	}
}

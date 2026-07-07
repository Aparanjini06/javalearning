package com.codegnan.java8;

import java.util.function.Function;

public class LengthString {
public static void main(String[] args) {
	Function <String,Integer> s=n -> n.length();
	System.out.println(s.apply("appu"));
	
	Function<String,String> s1=n1->n1.toUpperCase();
	System.out.println(s1.apply("appu"));
	
	Function<Integer,Double>s2=n2->(n2*9/5)+32.0;
	System.out.println(s2.apply(25));
	

}
}

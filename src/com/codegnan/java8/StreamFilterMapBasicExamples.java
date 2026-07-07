package com.codegnan.java8;

import java.util.Arrays;
import java.util.List;

public class StreamFilterMapBasicExamples {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 25, 30, 45, 50, 75, 100);
		List<String> names = Arrays.asList("Ravi", "Priya", "Arjun", "Deepa", "Anil", "Bhavana", "Krishna", "Vijay");
		
		//Filter
		System.out.println("Q1: Even Numbers");
		numbers.stream().filter(i -> i%2==0).forEach(System.out::println);
		
		System.out.println("Q2: Numbers greater than 40");
		numbers.stream().filter(i -> i>40).forEach(System.out::println);
		
		System.out.println("Q3: Filter names starting with A");
		names.stream().filter(str -> str.startsWith("A")).forEach(System.out::println);
		
		System.out.println("Q4: Names having length > 5");
		names.stream().filter(str -> str.length() > 5).forEach(System.out::println);
		
		System.out.println("Q5: Numbers divisible by 5");
		System.out.println("Q6: Names containing 'a'");
		System.out.println("Q7: Numbers less than 50");
		System.out.println("Q8: Names ending with 'a'");
		System.out.println("Q9: Number between 20 and 80");
		System.out.println("Q10: Names with even number of characters");
		
		
		// Map 
		System.out.println("Q1: Multiply each number by 2");
		numbers.stream().map(n->n*2).forEach(System.out::println);
		
		System.out.println("Q2: Adding 10 to each number");
		numbers.stream().map(n->n+10).forEach(System.out::println);
		
		System.out.println("Q3: Convert numbers to String");
		numbers.stream().map(n->"value " +n).forEach(System.out::println);
		
		System.out.println("Q4: Square of each number");
		
		System.out.println("Q5: Convert names to uppercase");
		
		System.out.println("Q6: Convert names to lowercase");
		
		System.out.println("Q7: Get length of each name");
		
		System.out.println("Q8: Add 18% GST to each number");
		
		System.out.println("Q9: ");
		
		System.out.println("Q10: ");
	}

}
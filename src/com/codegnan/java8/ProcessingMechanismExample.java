package com.codegnan.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProcessingMechanismExample {
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(5, 10, 20, 15, 25, 30);
		List<String> names = Arrays.asList("ravi", "teja", "priya", "arjun", "deepa");
		System.out.println("1. collect() method examples ");
		List<Integer> evenNum = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(evenNum);
		List<Integer> oddNum = numbers.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
		System.out.println(oddNum);
		List<Integer> GreaterNum = numbers.stream().filter(n -> n > 25).collect(Collectors.toList());
		System.out.println(GreaterNum);
		List<String> longName = names.stream().filter(name -> name.length() > 4).collect(Collectors.toList());
		System.out.println(longName);
		List<String> namesWithA = names.stream().filter(name -> name.toLowerCase().contains("a"))
				.collect(Collectors.toList());
		System.out.println(namesWithA);
		System.out.println("2. count()---> count filtered examples");
		System.out.println("count of even numbers :" + numbers.stream().filter(n -> n % 2 == 0).count());
		System.out.println("count of numbers> 30:" + numbers.stream().filter(n -> n > 25).count());
		System.out.println("count of names starting with a:"
				+ names.stream().filter(na -> na.toLowerCase().startsWith("a")).count());
		System.out
				.println("counts of names containing i:" + names.stream().filter(na -> na.contentEquals("i")).count());
		System.out.println("count of long name>5:" + names.stream().filter(na -> na.length() > 5).count());
		System.out.println("Processing by sorted()");
		System.out.println("Numbers in ascending order: " + numbers.stream().sorted().collect(Collectors.toList()));
		System.out.println("Numbers in descending order: "
				+ numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
		System.out.println("Names in ascending order :" + names.stream().sorted().collect(Collectors.toList()));
		System.out.println("Names in descending order: "
				+ names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
		System.out.println("Names by length() :"
				+ names.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList()));
		System.out.println("Names by length() reverse:"
				+ names.stream().sorted(Comparator.comparing(String::length).reversed()).collect(Collectors.toList()));
		System.out.println("Processing by min method");
		//numbers.stream().min(Integer::compareTo).ifPresent(min->System.out.println("Minimum number: "+min));
		String min=names.stream().min((s1,s2)->s1.compareTo(s2)).get();
		System.out.println(min);
		String max=names.stream().max((s1,s2)->-s1.compareTo(s2)).get();
		System.out.println(max);
		Integer min1=numbers.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(min1);
		Integer max1=numbers.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(max1);
		System.out.println("--------------toArray()---------------");
		System.out.println("toArray() convert stream toArray");
		Integer[] evenArr=numbers.stream().filter(n->n%2==0).toArray(Integer[]::new);
		System.out.println(Arrays.toString(evenArr));
		String[] upperArr=names.stream().map(String::toUpperCase).toArray(String[]::new);
		System.out.println(Arrays.toString(upperArr));
		//stream.of();
		System.out.println("Stream.of() Direct Stream Creation");
		Stream.of(10,20,30,40,50,60).filter(n->n>25).forEach(System.out::println);
		Stream.of("mango","apple","banana").sorted().forEach(System.out::println);
		
	}
}

package com.codegnan.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCustomObjectExample {
	public static void main(String[] args) {
		List<Emp> employees =Arrays.asList(
				new Emp(101,"Ravi","HR",40000,"hyd"),
				new Emp(102,"teja","IT",160000,"vsp"),
				new Emp(103,"arjun","HR",150000,"hyd"),
				new Emp(104,"arun","IT",45000,"vsp")
				);
		System.out.println("1. Correct");
		List<Emp>hignEarners=employees.stream().filter(e->e.getSalary()>70000).collect(Collectors.toList());
		System.out.println(hignEarners);
		List<Emp>cityHyd=employees.stream().filter(e->e.getCity().equals("hyd")).collect(Collectors.toList());
		System.out.println(cityHyd);
		System.out.println(employees.stream().filter(e->e.getSalary()>50000).count());
		System.out.println(employees.stream().sorted(Comparator.comparing(Emp::getSalary)).collect(Collectors.toList()));
	}
}

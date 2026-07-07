package com.codegnan.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		Consumer<String> c = s -> System.out.println(s);
		c.accept("Hello java");
		Consumer<Integer> n = sq -> System.out.println("Square " + sq * sq);
		n.accept(5);
		Consumer<String> c1 = s -> System.out.println(s.toUpperCase());
		c1.accept("hello");
		List<String> languages = Arrays.asList("java", "python", "c", "c++");
		Consumer<String> c2 = s -> System.out.println("languages: " + s);
		languages.forEach(c2);
		Consumer<Employee> display = e -> System.out
				.println("Employee Name : " + e.getName() + " Salary : " + e.getSalary());

		Employee e1 = new Employee("Malli", 54000);
		display.accept(e1);

	}

}

package com.codegnan.java8;

import java.util.function.Function;

public class StudentGradeFunctionExample {
	public static void main(String[] args) {

		Function<Student, String> grade = student -> {
			if (student.marks >= 80) {
				return "A Grade";
			} else if (student.marks >= 60) {
				return "B Grade";
			} else if (student.marks >= 40) {
				return "C Grade";
			} else {
				return "Fail";
			}
		};

		Student s1 = new Student("Venu", 58);
		Student s2 = new Student("Renu", 45);
		Student s3 = new Student("Arjun", 35);

		System.out.println(s1.name + " ------> " + grade.apply(s1));
		System.out.println(s2.name + " ------> " + grade.apply(s2));
		System.out.println(s3.name + " ------> " + grade.apply(s3));
	}
}
package com.codegnan.fundmentals;

import java.util.Scanner;

public class StudentDeatils {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter student name:");
		String name = s.next();
		System.out.println("Enter roll number:");
		int rollno = s.nextInt();
		System.out.println("Enter age:");
		int age = s.nextInt();
		System.out.println("Enter grade:");
		char grade = s.next().charAt(0);
		System.out.println("STUDENT DETAILS");
		System.out.println("------------------------------");
		System.out.println("Student Name:" + name);
		System.out.println("Student Roll Number:" + rollno);
		System.out.println("Student Age:" + age);
		System.out.println("Student Grade:" + grade);
		s.close();

	}

}

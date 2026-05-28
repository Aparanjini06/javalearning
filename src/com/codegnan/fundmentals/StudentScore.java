package com.codegnan.fundmentals;

import java.util.Scanner;

public class StudentScore {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter test 1 marks: ");
		int test1 = s.nextInt();
		System.out.println("Enter test 2 marks: ");
		int test2 = s.nextInt();
		System.out.println("Enter test 3 marks: ");
		int test3 = s.nextInt();
		int tot = test1 + test2 + test3;
		float average = (float) tot / 3;
		System.out.println("The average score of three tests : " + (int) average);
		s.close();
	}

}

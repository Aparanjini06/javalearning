package com.codegnan.fundmentals;

import java.util.Scanner;

public class Palindrom {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = s.nextInt();
		int temp = num;
		int reverse = 0;
		while (num != 0) {
			int remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		String result=(temp==reverse)?"Palindrom":"not palindrom";
		System.out.println(result);
		s.close();
	}
}

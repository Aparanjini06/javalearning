package com.codegnan.fundmentals;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = s.nextInt();
		int temp=num;
		int sum = 0;
		while (num != 0) {
			int remainder = num % 10;
			sum += remainder;
			num = num / 10;
		}
		System.out.println("The Sum of digit for "+temp+" is:"+sum);
		s.close();
	}

}

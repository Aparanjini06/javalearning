package com.codegnan.fundmentals;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		while (num != 1 && num != 4) {
			int sum = 0;
			while (num != 0) {
				int rem = num % 10;
				sum += rem * rem;
				num /= 10;

			}
			num = sum;

		}
		if (num == 1) {
			System.out.println("happy number");
		} else {
			System.out.println("Not a happy number");
		}
		s.close();
	}

}

package com.codegnan.fundmentals;

import java.util.Scanner;

public class Fibonaci {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = 0, b = 1;
		int num = s.nextInt();
		int fib = 0;
		System.out.print(a + " " + b + " ");
		for (int i = 2; i < num; i++) {
			fib = a + b;
			a = b;
			b = fib;
			System.out.print(fib + " ");
		}

		s.close();
	}

}

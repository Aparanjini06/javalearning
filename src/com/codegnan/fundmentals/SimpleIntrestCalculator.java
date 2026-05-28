package com.codegnan.fundmentals;

import java.util.Scanner;

public class SimpleIntrestCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principle amount :");
		double principal = sc.nextDouble();
		System.out.println("enter rate of intrest in %");
		double rate = sc.nextDouble();
		System.out.println("enter time in years:");
		double time = sc.nextDouble();
		double si = (principal * rate * time) / 100;
		double totalAmount = si + principal;
		System.out.println("simple intrest: " + si);
		System.out.println("Total Amount:" + totalAmount);
		sc.close();
	}

}

package com.codegnan.fundmentals;

import java.util.Scanner;

public class DivisibilityRule {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=s.nextInt();
		//DIVISIBLE BY 2
		if (number%2==0) {
			System.out.println("Divisible by 2");
		}
		//DIVISIBLE BY 3
		int temp3=number;
		int sum=0;
		while(temp3>0) {
			int digit=temp3%10;
			sum+=digit;
			temp3=temp3/10;
		}
		if(sum%3==0) {
			System.out.println("Divisible by 3");
		}
		
		//DIVISIBLE BY 4
		int temp4= number;
		int div4=0;
		div4 = temp4%100;
		if(div4 % 4==0) {
			System.out.println("Divisible by 4");
		}
		s.close();
		//Divisible by  5
		
	}

}

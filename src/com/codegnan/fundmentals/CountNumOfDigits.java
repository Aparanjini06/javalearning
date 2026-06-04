package com.codegnan.fundmentals;

import java.util.Scanner;

public class CountNumOfDigits {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=s.nextInt();
		int temp=num;
		int count=0;
		while(num!=0) {
			num=num/10;
			count++;
		}
		System.out.println("the count of digits in a given number: "+temp + " is "+count);
		s.close();
	}

}

package com.codegnan.fundmentals;

import java.util.Scanner;

public class PrintPositiveNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=s.nextInt();
		if(num>0) {
			System.out.println("The Number " + num + " is positive");
		}
		s.close();
	}

}

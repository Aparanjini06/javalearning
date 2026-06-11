package com.codegnan.oop;

import java.util.Scanner;

public class FactorialUsingRecursion {
	public static long factorial(int n) {
		if(n==0)
		{
			return 1;
		}
		else {
			return n*factorial(n-1);
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		if(n<0 || n>20)
		{
			System.out.println("invalid input. N must be between o to 20");
		}
		else {
			long result=FactorialUsingRecursion.factorial(n);
			System.out.println(result);
		}
		s.close();
	}

}

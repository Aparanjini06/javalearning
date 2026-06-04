package com.codegnan.fundmentals;

import java.util.Scanner;

public class LoopExample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int i;
		/*while(i<=n) {
			System.out.println(i);
			i+=2;
		}
		s.close();*/
		/*do {
			System.out.println(i);
			i+=2;
		}while(i<=n);*/
		for(i=1;i<=n;i++)
		{
			System.out.println(i);
		}
		s.close();
	}

}

package com.codegnan.fundmentals;

import java.util.Scanner;

public class ButterflyPattern {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int row=s.nextInt();
		
		//upper star
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			int spaces=2*(row-i);
			for(int j=1;j<=spaces;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=row;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			int spaces=2*(row-i);
			for(int j=1;j<=spaces;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		s.close();
	}

}

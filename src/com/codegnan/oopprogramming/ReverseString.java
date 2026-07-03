package com.codegnan.oopprogramming;

import java.util.Scanner;

public class ReverseString {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.print("Enter a string : ");
	String str=s.next();
	String rev="";
	for(int i=str.length()-1;i>=0;i--)
	{
		char current = str.charAt(i);
		rev+=current;
	}
	System.out.println("reverse of a string : "+str+" is "+rev);
	s.close();
	}
}

package com.codegnan.fundmentals;

import java.util.Scanner;

public class AreaCircle {

	public static void main(String[] args) {
		double pie=3.14;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter radius:");
		int radius = s.nextInt();
		double area = pie * (radius * radius);
		System.out.println("the area of circle: "+area);
		s.close();
	}

}

package com.codegnan.fundmentals;

import java.util.Scanner;

public class FarhenhietToCelsius {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Fahrenhiet value:");
		double fahren = s.nextDouble();
		double res = ((fahren - 32) * 5.0 / 9);
		System.out.println("Fahrenheit =" + fahren);
		System.out.println("Fahrenheit to Celsius :" + (int)res);
		s.close();

	}

}

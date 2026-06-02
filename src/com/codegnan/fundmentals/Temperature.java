package com.codegnan.fundmentals;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the temperature");
		int temp=s.nextInt();
		if(temp>30) {
			System.out.println("The temperature is high");
		}
		if(temp<10) {
			System.out.println("the temperature is low");
		}
		if(temp<30 && temp>10) {
			System.out.println("Temperature is normal");
		}
		s.close();
	}

}

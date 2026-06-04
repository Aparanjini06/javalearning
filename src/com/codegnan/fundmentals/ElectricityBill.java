package com.codegnan.fundmentals;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int units=s.nextInt();
		double results=(units<=100)?(units*2):(units<300)?((100*2)+((units-100)*4)):
			((100*2)+(200*4)+((units-300)*6));
		double bill=(results>500)?(results+(results*0.05)):results;
		System.out.println(bill);
		System.out.println(results+(results*0.95));
		s.close();
	}

}

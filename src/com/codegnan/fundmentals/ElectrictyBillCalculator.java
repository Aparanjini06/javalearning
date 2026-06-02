package com.codegnan.fundmentals;

import java.util.Scanner;

public class ElectrictyBillCalculator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number of units electricty consumed ");
		int units = s.nextInt();
		System.out.println("Are you senior citizen? (true/false)");
		boolean isSeniorCitizen = s.nextBoolean();
		double billAmount=0;
		if(units<=100) {
			billAmount= units*1.5;
		}
		else {
			if(units<=200 ) {
				billAmount = (100*1.5)+((units-100)*2);
			}
			else {
				if(units<=300) {
					billAmount =(100*1.50)+(100*2)+((units-200)*3);
				}
				else {
					billAmount = (100*1.5)+(100*2)+(100*3)+((units-300)*5);
				}
			}
		}
		double surCharge=0;
		if(billAmount>1000) {
			surCharge =billAmount*0.10;
		}
		double discount=0;
		if(isSeniorCitizen) {
			discount = (billAmount+surCharge)*0.05;
		}
		double totalPayAmount =  billAmount+surCharge-discount;
		System.out.println("Electricty Bill");
		System.out.println("--------------------------");
		System.out.println("Number of units consumed: "+ units);
		System.out.println("Base Amount: "+billAmount);
		System.out.println("surcharge Amount :"+surCharge);
		System.out.println("Discount: "+discount);
		System.out.println("Total AMouunt: "+totalPayAmount);
		
		s.close();
	}

}

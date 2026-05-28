package com.codegnan.fundmentals;
import java.util.Scanner;
public class IntrestCalculate {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter principal amount:");
		double principal= s.nextDouble();
		System.out.println("Enter rate of intrest:");
		double rate=s.nextDouble();
		System.out.println("Enter time in months");
		int time=s.nextInt();
		double si=(principal*rate*time)/(100*12);
		double amount=principal*Math.pow((1+rate/1200.0),time);
		double ci=amount-principal;
		System.out.println("the simple intrest is:"+si);
		System.out.println("the compound intrest is:"+ci);
		System.out.println("the original amount is:"+amount);
		s.close();
	}
}

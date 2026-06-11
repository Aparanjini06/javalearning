package com.codegnan.oop;

import java.util.Scanner;

public class FitLifeTest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int hours1=s.nextInt();
		int hours2=s.nextInt();
		String type=s.next();
		s.nextLine();
		int hours3=s.nextInt();
		int fixedCost=50;
		int id1=s.nextInt();
		int id2=s.nextInt();
		String type2=s.next();
		FitLife f1=new FitLife(id1);
		FitLife f2=new FitLife(id2,type2);
		System.out.println(f1.calculateFine(hours1));
		System.out.println(f1.calaculateFine(hours2, type));
		System.out.println(f1.calculateFine(hours3, fixedCost));
		System.out.println(f1.getId());
		System.out.println(f2.getId());
		s.close();
	}

}

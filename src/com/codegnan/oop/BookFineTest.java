package com.codegnan.oop;

import java.util.Scanner;

public class BookFineTest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int days1=s.nextInt();//days for methods 1
		int days2=s.nextInt();//days for method 2
		String type=s.next();
		s.nextLine();
		int days3=s.nextInt();
		int fixedCost=10;
		int id1=s.nextInt();
		int id2=s.nextInt();
		String type2=s.next();
		Book b1=new Book(id1);
		Book b2=new Book(id2,type2);
		System.out.println(b1.claculateFine(days1));
		System.out.println(b1.calculateFine(days2, type));
		System.out.println(b1.calculateFine(days3, fixedCost));
		System.out.println(b1.getId());
		System.out.println(b2.getId());
		s.close();
	}

}

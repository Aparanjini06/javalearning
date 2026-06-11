package com.codegnan.oop;

import java.util.Scanner;

public class LibararyFineTest {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int daysOverdue=s.nextInt();
		int days=s.nextInt();
		String bookType=s.next();
		int staticFine=LibraryFineCalculator.calculateTotalFine(daysOverdue);
		LibraryFineCalculator l=new LibraryFineCalculator();
		int instanceFine=l.calculateBookFine(days, bookType);
		System.out.println(staticFine+ " "+instanceFine);
		s.close();
	}
	

}

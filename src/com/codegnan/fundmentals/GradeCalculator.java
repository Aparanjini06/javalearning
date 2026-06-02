package com.codegnan.fundmentals;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Student Score: ");
		int score=s.nextInt();
		if(score>=90) {
			System.out.println("A Grade");
		}
		else {
			if(score>=80) {
				System.out.println("B Grade");
			}
			else {
				if(score>=70) {
					System.out.println("C Grade");
				}
				else {
					if(score>=60) {
						System.out.println("D Grade");
					}
					else {
						System.out.println("F Grade");
					}
				}
			}
		}
		s.close();
	}

}

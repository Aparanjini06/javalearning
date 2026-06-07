package com.codegnan.fundmentals;

import java.util.Scanner;

public class RectangleStarPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int row = s.nextInt();
		System.out.println("Enter number of columns");
		int col = s.nextInt();
		//outer for loop always talks about rows
		for (int i = 0; i < row; i++) {
			//inner for loop always talks about columns
			for (int j = 0; j < col; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		s.close();
	}

}

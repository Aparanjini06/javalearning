package com.codegnan.fundmentals;

import java.util.Scanner;

public class GroceryStore {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter price of an item:");
		double price = s.nextDouble();
		System.out.println("Enter Quantity of an item");
		int quantity = s.nextInt();
		double res = price * quantity;
		System.out.println("Total bill:" + (int) res);
		s.close();
	}

}

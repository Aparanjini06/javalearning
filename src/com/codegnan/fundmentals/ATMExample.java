package com.codegnan.fundmentals;

import java.util.Scanner;

public class ATMExample {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double balance = 5000.0;
		int pin = 1234;
		System.out.println("Enter your pin:");
		int enteredPin = s.nextInt();
		if (enteredPin != pin) {
			System.out.println("invalid pin");
			return;
		}
		int choice;
		do {
			System.out.println("----------ATM MACHINE----------");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Exit");
			System.out.println("enter your choice:");
			choice = s.nextInt();
			switch (choice) {
			case 1:
				System.out.println("balance: " + balance);
				break;
			case 2:
				System.out.println("Enter Deposit amount ");
				double depositAmount = s.nextDouble();
				if (depositAmount % 100 != 0) {
					System.out.println("Enter amount in multiple of 100");
				} else {
					if (depositAmount < 500) {
						System.out.println("Enter more than 500");
					} else {
						balance += depositAmount;
						System.out.println("deposited :" + depositAmount
								+ " Amount successfully , your updated balance is :" + balance);
					}
				}
				break;
			case 3:
				System.out.println("Enter withdraw amount");
				double withdraw = s.nextDouble();
				if (withdraw % 100 != 0) {
					System.out.println("Enter amount in multiple of 100");
				} else {
					if (withdraw < 500) {
						System.out.println("Enter more than 500");
					} else {
						if (withdraw > balance) {
							System.out.println("Insufficient balance");
						} else {
							balance -= withdraw;
							System.out.println("amount withdraw : " + withdraw
									+ " successfully , your updated balance is :" + balance);
						}
					}
				}
				break;
			case 4:
				System.out.println("Exit");
				break;
			default:
				System.out.println("invalid choice, choice between (1-4) options");
			}
		} while (choice != 4);

		s.close();
	}

}

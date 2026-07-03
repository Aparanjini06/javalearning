package com.codegnan.exceptions;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		ATM a=new ATM();
		boolean authenticated=false;
		while(!authenticated)
		{
			System.out.println("Enter your pin: ");
			int enteredPin=sc.nextInt();
			try {
				authenticated=a.verifyPin(enteredPin);
			} catch (InvalidPinException e) {
				e.printStackTrace();
			}
		}
		while(true)
		{
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. checkbalance");
			System.out.println("4. Exit");
			System.out.println("enter your choice: ");
			int ch=sc.nextInt();
			try
			{
				switch(ch)
				{
				case 1:
					System.out.println("Enter deposit amount: ");
					double depositamount=sc.nextDouble();
					a.deposit(depositamount);
					break;
				case 2:
					System.out.println("Enter withdraw amount: ");
					double withdrawamount=sc.nextDouble();
					a.withdrawAmount(withdrawamount);
					break;
				case 3:
					a.checkBalance();
					break;
				case 4:
					System.out.println("Thank you for using ATM machine");
					return;
				default:
					System.out.println("Invalid options. choose (1-4) options");
					break;
				}
			}
			catch(InsufficientFundsException|InvalidAmountException e)
			{
				e.printStackTrace();
			}
		}
	}
}

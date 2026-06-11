package com.codegnan.oop;

public class BankAccount {
	String accHolderName;
	long accountNumber;
	double balance;
	
	public void createAccount(String name, long accNumber,double initialBalance) {
		accHolderName=name;
		accountNumber=accNumber;
		balance=initialBalance;
	}
	public void deposit(double amount) {
		balance+=amount;
		System.out.println(amount + "deposited succesfully");
	}
	public void withdraw(double amount) {
		if(balance>amount)
		{
			balance-=amount;
			System.out.println(amount+" withdraw succesfully");
		}
		else {
			System.out.println("Insufficent funds");
		}
	}
	public void display()
	{
		System.out.println("Account Holder Name:"+accHolderName);
		System.out.println("Account number"+accountNumber);
		System.out.println("Balance: "+balance);
	}
	
}


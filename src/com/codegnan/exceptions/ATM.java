package com.codegnan.exceptions;

public class ATM {
	private final int pin=1234;
	private double balance=5000;
	private int pinAttemps=0;
	public void checkBalance()
	{
		System.out.println("Balance: "+balance);
	}
	public boolean verifyPin(int enteredPin) throws InvalidPinException
	{
		if(pin==enteredPin)
		{
			pinAttemps=0;
			System.out.println("Access Granted");
			return true;
		}
		else
		{
			pinAttemps++;
			if(pinAttemps>=3)
			{
				throw new InvalidPinException("Too many Incorrect Attemps. Access Blocked");
			}
			else
			{
				System.out.println("Invalid pin. Attemps left "+(3-pinAttemps));
				return false;
			}
		}
		
	}
	public double withdrawAmount(double amount) throws InvalidAmountException, InsufficientFundsException
	{
		if(amount%100!=0||amount<=0)
		{
			throw new InvalidAmountException("Amount must be positive and multiples of 100");
		}
		else
		{
			if(amount>balance)
			{
				throw new InsufficientFundsException("Insuffient funds");
			}
			else
			{
				balance=balance-amount;
				System.out.println("Available balance: "+balance);
			}
		}
		return balance;
	}
	public double deposit (double amount) throws InvalidAmountException
	{
		if(amount%100!=0||amount<=0)
		{
			throw new InvalidAmountException("Amount must be positive and multiples of 100");
		}
		else
		{
			balance=balance+amount;
			System.out.println("Deposited successful. New Balance: "+balance);
		}
		
		return balance;
	}
	
}

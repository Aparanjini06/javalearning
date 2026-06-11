package com.codegnan.oop;

public class BankAcc {
	double balance;

	public BankAcc(double balance) {
		super();
		this.balance = balance;
	}

	public void depoist(double amount) {
		balance += amount;
		System.out.println("Deposited Cash: " + amount);
	}
	public void deposit(double amount,String chequeNumber) {
		balance+=amount;
		System.out.println("Deposited: "+amount+" via cheque "+chequeNumber);
	}
	public void deposit(double amount,String transactionId,String bankName)
	{
		balance+=amount;
		System.out.println("Deposited "+amount+" Via online transfer");
		System.out.println("Transaction Id: "+transactionId+" Bank "+bankName);
	}
	public void showBalance() {
		System.out.println("Current Balance : "+balance);
	}
	public static void main(String[] args) {
		BankAcc acc=new BankAcc(5000.0);
		acc.depoist(2000);
		acc.deposit(12000, "chq4321");
		acc.deposit(1200, "TXN8976532854", "HDFC");
		acc.showBalance();
	}
}

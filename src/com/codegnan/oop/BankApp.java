package com.codegnan.oop;

public class BankApp {

	public static void main(String[] args) {
		BankAccount a1=new BankAccount();
		a1.createAccount("appu", 1346541521, 10000);
		a1.display();
		a1.deposit(10000);
		a1.withdraw(2000);
		a1.display();
		BankAccount a2=new BankAccount();
		a2.createAccount("jaya", 147852369, 20000);
		a2.display();
	}

}

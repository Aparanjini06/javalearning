package com.codegnan.oopprogramming;

public class Calculator {
	int firstNum;
	int secondNum;
	public Calculator(int firstNum, int secondNum) {
		super();
		this.firstNum = firstNum;
		this.secondNum = secondNum;
	}
	
	public int addition() {
		return firstNum+secondNum;
	}
}

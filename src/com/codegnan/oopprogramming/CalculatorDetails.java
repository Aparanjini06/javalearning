package com.codegnan.oopprogramming;

import java.util.Scanner;

public class CalculatorDetails {

	public static void main(String[] args) {
		/*My_Calculator m=new My_Calculator();
		m.InputValue();
		m.addition();
		m.multiplication();*/
		Scanner s=new Scanner(System.in);
		int firstNum=s.nextInt();
		int secondNum=s.nextInt();
		My_Calculator m=new My_Calculator(firstNum,secondNum);
		int sum=m.addition();
		int product=m.multiplication();
		System.out.println(sum);
		System.out.println(product);
		s.close();
		
		
	}

}

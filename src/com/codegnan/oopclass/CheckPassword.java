package com.codegnan.oopclass;

import java.util.Scanner;

public class CheckPassword {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String password=sc.nextLine();
		PasswordChecker pass=new SimplePasswordChecker();
		System.out.println(pass.checkLenght(password));
		System.out.println(pass.checkComplexity(password));
		sc.close();
	}
	
	
}

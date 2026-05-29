package com.codegnan.fundmentals;

public class StringConcatinationEx {

	public static void main(String[] args) {
		int a = 10, b = 20, c = 30;
		String d = "Codegnan";
		System.out.println(a + b + c + d);
		System.out.println(b + c + d + a);//50Codegnan10
		System.out.println(c + d + a + b);//30Codegnan1020
		System.out.println(d + a + b + c);//Codegnan102030
	}

}

package com.codegnan.java8;
interface Interf1
{
	int square(int a);
}
public class Main {
	public static void main(String[] args) {
		Interf1 i=a->a* a;
		System.out.println("Square is: "+i.square(5));
	}
}

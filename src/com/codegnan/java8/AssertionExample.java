package com.codegnan.java8;

public class AssertionExample {

	public static void main(String[] args) {
		int studentAge=20;
		assert(studentAge>=18/*180*/):"age should be less than 20";
		System.out.println("valid student age : "+studentAge);
	}

}

package com.codegnan.oop;

public class OverloadDemo {
void test() {
	System.out.println("No parameters");
}
void test(int a,int b) {
	System.out.println("A and B is "+a+" "+b);
}
void test(double a)
{
	System.out.println("inside test(double) a "+a);
}
	
	public static void main(String[] args) {
		OverloadDemo od=new OverloadDemo();
		od.test();
		od.test(10,20);
		od.test('a', 10);
		od.test(10);//automatic promotion in overloading(int->double)
		od.test(10.5);
	}

}

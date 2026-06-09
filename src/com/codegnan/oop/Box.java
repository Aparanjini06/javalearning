package com.codegnan.oop;

public class Box {
	double width;//instance variable
	double height;
	double depth;
	//instance method
	public void volume() {
		System.out.println("Box height : "+height);
		System.out.println("Box width : "+width);
		System.out.println("Box depth : "+depth);
		double volume=width*depth*height;
		System.out.println("Box volume is : "+volume);
		
	}
	public static void main(String[] args) {
		Box b1=new Box();
		b1.volume();
		Box b2=new Box();
		b2.depth=12.0;
		b2.height=10.0;
		b2.width=2.0;
		b2.volume();
	}
}

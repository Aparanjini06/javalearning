package com.codegnan.iostreams;

public class Test{
	public static void main(String[] args) {
		PopCorn p=new PopCorn() {
			public void taste()
			{
				System.out.println("Salty");
			}
		};
		p.taste();
		PopCorn p2=new PopCorn() {
			public void taste() {
				System.out.println("sweet");
			}
		};
		System.out.println(p.getClass().getName());
		System.out.println(p2.getClass().getName());
	}
}

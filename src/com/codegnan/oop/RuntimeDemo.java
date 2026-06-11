package com.codegnan.oop;

import java.util.Date;

public class RuntimeDemo {

	public static void main(String[] args) {
		Runtime run=Runtime.getRuntime();
		System.out.println("Total memory of the heap "+run.totalMemory());
		System.out.println("Free memory of the heap "+run.freeMemory());
		for(int i=0;i<100000;i++)
		{
			Date d=new Date();
			d.after(d);//
			d=null;
		}
		System.out.println("Free memory of the heap "+run.freeMemory());
		run.gc();
		System.out.println("Free memory of the heap "+run.freeMemory());

	}

}

package com.codegnan.java8;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SuppliersExample {
	public static void main(String[] args) {
		Supplier<String>message=()->"hello from Supplier";
		System.out.println(message.get());
		Supplier<Integer> number=()->(int)(Math.random()*100);
		System.out.println(number.get());
		Supplier<LocalDate>message1=()->LocalDate.now();
		System.out.println(message1.get());
		Supplier<String>otp=()->{
			String code="";
			for(int i=0;i<6;i++)
			{
				code+=(int)(Math.random()*10);
			}
			return code;
		};
		System.out.println("Generated otp: "+otp.get());
	}
}

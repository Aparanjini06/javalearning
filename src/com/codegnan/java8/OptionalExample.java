package com.codegnan.java8;

import java.util.Optional;

public class OptionalExample {
	public static void main(String[] args) {
		String names[]= {"aa",null,"bab",null,"ccdd",null,null};
		/*for(String name:names)
		{
			if(name!=null)
			{
				System.out.println(name.toUpperCase());
			}
			else
			{
				System.out.println("Null value found");
			}
		}
		for(String name:names)
		{
			Optional<String>opt=Optional.ofNullable(name);
			opt.ifPresent(v->System.out.println(v.toLowerCase()));
		}*/
		for(String name:names)
		{
			Optional<String>opt=Optional.ofNullable(name);
			opt.ifPresentOrElse(v->System.out.println(v.toLowerCase()),
					()->System.out.println("null value found"));
		}
		
	}
}

package com.codegnan.java8;
interface Interf
{
	boolean greater(int a);
}
/*class Test implements Interf
{

	@Override
	public boolean greater(int a) {

		if(a>10) {
			return false;
			
		}
		return false;
		
	}
	
}*/
public class Main1 {
public static void main(String[] args) {
	Interf i=a-> {
			if(a>10) {
				return true;
			}return false;
	};
	System.out.println(i.greater(100));
}
}

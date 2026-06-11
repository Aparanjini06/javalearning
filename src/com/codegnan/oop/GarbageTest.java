package com.codegnan.oop;

public class GarbageTest {
protected void finalize() {
	System.out.println("Garbage collector called finalize()");
}
	public static void main(String[] args) {
		GarbageTest g=new GarbageTest();
		g.finalize();
		g=null;
		System.out.println("Requesting garbage collection");
		System.gc();
		System.out.println("End of main method");
		
	}

}

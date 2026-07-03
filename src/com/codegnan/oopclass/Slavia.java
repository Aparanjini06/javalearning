package com.codegnan.oopclass;

public class Slavia implements Car{
	@Override
	public void turnDirection(String dir) {
		if(dir.equalsIgnoreCase("Left"));
		{
			System.err.println("Slavia is turing left");
		}
		if(dir.equalsIgnoreCase("Right"))
		{
			System.out.println("Slavia is turing right");
		}
	}

	@Override
	public void accelerate(int points) {
		if(points>=10 && points<=100)
		{
			System.out.println("Slavia speed is: "+points);
		}
	}
	

	@Override
	public void stop() {
		System.out.println("Slavia has stopped");
	}
}

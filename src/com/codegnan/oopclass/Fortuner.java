package com.codegnan.oopclass;

public class Fortuner implements Car{

	@Override
	public void turnDirection(String dir) {
		if(dir.equalsIgnoreCase("Left"));
		{
			System.err.println("Fortuner is turing left");
		}
		if(dir.equalsIgnoreCase("Right"))
		{
			System.out.println("Fortuner is turing right");
		}
	}

	@Override
	public void accelerate(int points) {
		if(points>=10 && points<=100)
		{
			System.out.println("Fortuner speed is: "+points);
		}
	}
	

	@Override
	public void stop() {
		System.out.println("Fortuner has stopped");
	}
	public void wheels() {
		System.out.println("4 wheels");
	}

}

package com.codegnan.oopclass;

public class VehicleApp {
	public static void main(String[] args) {
		Car c=new Fortuner();
		c.accelerate(20);
		c.accelerate(50);
		c.accelerate(80);
		c.accelerate(40);
		c.turnDirection("left");
		c.accelerate(60);
		c.accelerate(90);
		c.turnDirection("right");
		c.stop();
	}
}

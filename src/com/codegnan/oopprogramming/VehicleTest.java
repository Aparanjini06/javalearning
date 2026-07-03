package com.codegnan.oopprogramming;

public class VehicleTest  {
	public static void main(String[] args) {
		Vehicle v=new Bus();
		System.out.println(v.getNoOfWheels());
		v=new Auto();
		System.out.println(v.getNoOfWheels());
	}
}

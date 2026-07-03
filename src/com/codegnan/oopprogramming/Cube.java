package com.codegnan.oopprogramming;

import java.util.Scanner;

public class Cube extends Shape {

		public void calculateVolume() {
			System.out.print("side of the cube");
			Scanner s=new Scanner(System.in);
			double side=s.nextDouble();
			double volume=Math.pow(side, 3);
		
			System.out.printf("Volume of the cube: %.2f\n",volume);
			s.close();
		}

}

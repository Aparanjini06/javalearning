package com.codegnan.oopprogramming;

import java.util.Scanner;

public class Cuboid extends Shape {

    public void calculateVolume() {
        Scanner s = new Scanner(System.in);

        System.out.print("Length of cuboid: ");
        double length = s.nextDouble();

        System.out.print("Width of cuboid: ");
        double width = s.nextDouble();

        System.out.print("Height of cuboid: ");
        double height = s.nextDouble();

        double volume = length * width * height;

        System.out.printf("Volume of cuboid: %.2f%n", volume);

        // Do NOT close the scanner here if other classes use System.in
        s.close();
    }
}
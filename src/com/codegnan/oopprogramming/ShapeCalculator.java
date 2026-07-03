package com.codegnan.oopprogramming;

public class ShapeCalculator {

    public static void main(String[] args) {

        Shape s = new Shape();
        Cube c = new Cube();
        Cuboid cuboidInstance = new Cuboid();

        s.calculateVolume();
        c.calculateVolume();      // Fixed spelling
        cuboidInstance.calculateVolume();
    }
}
package com.kodilla.testing.shape;

import java.util.Random;

class Square implements Shape {
    public String getShapeName() {
        return "Square";
    }

    public double getField() {
        Random generatorSide = new Random();
        int side = generatorSide.nextInt(100) + 1;
        double area = side * side;
        return area;
    }
}

class Circle implements Shape {

    public String getShapeName() {
        return "Circle";
    }

    public double getField() {
        Random generatorRadius = new Random();
        int radius = generatorRadius.nextInt(100) + 1;
        double area =  radius * radius * Math.PI;
        return area;
    }
}

class Triangle implements Shape {
    public String getShapeName() {
        return  "Triangle";
    }

    public double getField() {
        Random generateBaseAndHeight = new Random();
        int base = generateBaseAndHeight.nextInt(100) + 1;
        int height = generateBaseAndHeight.nextInt(100) + 1;
        double area = (base * height)/2;
        return area;
    }
}






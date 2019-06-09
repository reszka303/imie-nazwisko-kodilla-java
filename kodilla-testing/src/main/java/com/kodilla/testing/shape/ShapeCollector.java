package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {


    private ArrayList<Shape> squareCircleTriangleList = new ArrayList<>();


    public void addFigure(Shape shape) {
        squareCircleTriangleList.add(shape);
    }

    public void removeFigure(Shape shape) {
        squareCircleTriangleList.remove(shape);
    }

    public Shape getFigure(int n) {
        Shape shape = squareCircleTriangleList.get(n);
        return shape;
    }

    public void showFigures() {
        for (int i = 0; i < squareCircleTriangleList.size(); i++) {
            System.out.println(squareCircleTriangleList.get(i));
        }
    }

    public ArrayList<Shape> getSquareCircleTriangleList() {
        return squareCircleTriangleList;
    }

}






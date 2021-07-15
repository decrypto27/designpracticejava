package com.example.demo.bridge;

public class Square extends Shape {

    double dimension;

    public Square(Color color, ShapeType shapeType, double dimension) {
        super(color, shapeType);
        this.dimension = dimension;
    }

    @Override
    public double getArea() {
        return dimension*dimension;
    }
}

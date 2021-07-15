package com.example.demo.bridge;

public class Circle extends Shape{

    double radius;

    public Circle(Color color, ShapeType shapeType, double radius) {
        super(color, shapeType);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }
}

package com.example.demo.bridge;

public abstract class Shape {

    protected Color color;

    public Shape(Color color, ShapeType shapeType) {
        this.color = color;
        this.shapeType = shapeType;
    }

    protected ShapeType shapeType;
    abstract public double getArea();
    public String getType(){
        return shapeType.toString() + " " + color.getColor();
    }
}

package com.example.demo.decorator;

public class WhippedCreamDecorator extends CoffeeDecorator {

    public static final String WHIPPED_CREAM = "Whipped Creamm";
    public static final String DELIMM = " ";

    public WhippedCreamDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getName() {
        return WHIPPED_CREAM + DELIMM + coffee.getName();
    }

    public Double getPrice() {
        return 2.0 + coffee.getPrice();
    }
}

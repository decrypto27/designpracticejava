package com.example.demo.decorator;

public abstract class CoffeeDecorator implements Coffee {

    public static final String DELIM = "  ";
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
    @Override
    public String getName() {
        return  coffee.getName();
    }
    @Override
    public Double getPrice() {
        return coffee.getPrice();
    }
}

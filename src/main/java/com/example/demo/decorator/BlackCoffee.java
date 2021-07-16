package com.example.demo.decorator;

public class BlackCoffee implements Coffee {

    public static final String BLACK_COFEE = "Black Coffee";

    @Override
    public String getName() {
        return BLACK_COFEE;
    }

    @Override
    public Double getPrice() {
        return 5.0;
    }
}

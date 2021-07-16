package com.example.demo.decorator;

public class MochaCofee implements Coffee {

    public static final String MOCHA = "Mocha";

    @Override
    public String getName() {
        return MOCHA;
    }

    @Override
    public Double getPrice() {
        return 33.0;
    }
}

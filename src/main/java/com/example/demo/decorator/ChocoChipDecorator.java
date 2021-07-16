package com.example.demo.decorator;

import static com.example.demo.decorator.WhippedCreamDecorator.DELIMM;

public class ChocoChipDecorator extends CoffeeDecorator {

    public static final String CHOCO_CHIP = "Choco Chip";

    public ChocoChipDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getName() {
        return CHOCO_CHIP + DELIMM + coffee.getName();
    }

    public Double getPrice() {
        return 2.0 + coffee.getPrice();
    }
}

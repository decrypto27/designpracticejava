package com.example.demo.composite;

public abstract class MenuComponent {
    public static final String DELIMM = "  ";
    String name;
    String path;

    public MenuComponent(String name, String path) {
        this.name = name;
        this.path = path;
    }

    public String printCommponent() {
        return name + DELIMM + path;
    }
}

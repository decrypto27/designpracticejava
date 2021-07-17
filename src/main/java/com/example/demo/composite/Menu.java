package com.example.demo.composite;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {
    List<MenuComponent> menuComponentList = new ArrayList<>();

    public Menu(String name, String path) {
        super(name, path);
    }

    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    @Override
    public String printCommponent() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.printCommponent());
        for (MenuComponent menuComponent : menuComponentList) {
            stringBuilder.append(menuComponent.printCommponent());
        }
        return stringBuilder.toString();
    }
}

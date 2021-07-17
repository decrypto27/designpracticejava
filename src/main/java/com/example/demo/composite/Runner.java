package com.example.demo.composite;

public class Runner {
    public static void main(String[] args) {
            Menu menu = new Menu("composite", "/" );
            MenuItem menuItem1 = new MenuItem("button", "/button");
            MenuItem menuItem = new MenuItem("radio", "/radio");
            System.out.println(menuItem.printCommponent());
            menu.add(menuItem);
            menu.add(menuItem1);
            System.out.println(menu.printCommponent());
    }
}

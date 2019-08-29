package com.kodilla.good.patterns.food2Door;

public class Product {
    private String name;


    public Product(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "" + name + ":";
    }
}

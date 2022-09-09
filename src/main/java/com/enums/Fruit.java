package com.enums;

public enum Fruit {
    ORANGE("Orange", 0.25),
    APPLE("Apple", 0.60);

    private String name;
    private double price;

    Fruit(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }
    public double getPrice() {
        return this.price;
    }
}
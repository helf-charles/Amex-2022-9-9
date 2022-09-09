package com.enums;

public enum Fruit {
    ORANGE("Orange", 0.25, 3, 0.25),
    APPLE("Apple", 0.60, 2, 0.60);

    private String name;
    private double price;
    private int discountQuantity;
    private double discountValue;

    Fruit(String name, double price, int discountQuantity, double discountValue) {
        this.name = name;
        this.price = price;
        this.discountQuantity = discountQuantity;
        this.discountValue = discountValue;
    }

    public String getName() {
        return this.name;
    }
    public double getPrice() {
        return this.price;
    }
    public int getDiscountQuantity() {
        return this.discountQuantity;
    }
    public double getDiscountValue() {
        return this.discountValue;
    }
}
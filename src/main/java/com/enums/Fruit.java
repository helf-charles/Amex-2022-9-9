package com.enums;

public enum Fruit {
    ORANGE("Orange", 0.25, 3, 0.25, 1.0),
    APPLE("Apple", 0.60, 2, 0.60, 1.0);

    private String name;
    private double price;
    private int discountQuantity;
    private double discountValue;
    private double version;

    Fruit(String name, double price, int discountQuantity, double discountValue, double version) {
        this.name = name;
        this.price = price;
        this.discountQuantity = discountQuantity;
        this.discountValue = discountValue;
        this.version = version;
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
    public double getVersion() { return this.version; }
}
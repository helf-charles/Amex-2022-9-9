package com.enums;

public enum OldFruit {
    ORANGE_02("Orange_02", 0.25, 0, 0.0, 0.9),
    ORANGE_01("Orange_01", 0.35, 3, 0.35, 0.8),
    APPLE_01("Apple_01", 0.50, 2, 0.50, 0.9);

    private String name;
    private double price;
    private int discountQuantity;
    private double discountValue;
    private double version;

    OldFruit(String name, double price, int discountQuantity, double discountValue, double version) {
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

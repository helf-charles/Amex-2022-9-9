package com.entity;

import com.enums.Fruit;

import java.util.List;

public class Order {
    private List<Fruit> fruitList;
    private List<Integer> quantityList;
    private double totalPrice;

    public void setFruitList(List<Fruit> fruitList) {
        this.fruitList = fruitList;
    }
    public void setQuantityList(List<Integer> quantityList) {
        this.quantityList = quantityList;
    }
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<Fruit> getFruitList() {
        return this.fruitList;
    }
    public List<Integer> getQuantityList() {
        return this.quantityList;
    }
    public double getTotalPrice() {
        return this.totalPrice;
    }
}

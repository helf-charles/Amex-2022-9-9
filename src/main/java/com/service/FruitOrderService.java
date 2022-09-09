package com.service;

import com.entity.Order;
import com.enums.Fruit;
import com.repository.FruitOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FruitOrderService {

    @Autowired
    private FruitOrderRepository fror;

    public Order orderFruit(int numApples, int numOranges) {
        if ((numOranges < 0) || (numApples < 0)) {
            return null;
        } else {
            double total = calculateTotal(numApples, numOranges);
            return new Order(numApples, Fruit.APPLE.getVersion(), numOranges, Fruit.ORANGE.getVersion(), total);
        }
    }

    public double calculateTotal(int numApples, int numOranges) {
        double aTotal = calculateLineItem(numApples, Fruit.APPLE);
        double oTotal = calculateLineItem(numOranges, Fruit.ORANGE);
        double aDiscount = calculateDiscount(numApples, Fruit.APPLE);
        double oDiscount = calculateDiscount(numOranges, Fruit.ORANGE);
        return ((aTotal + oTotal) - (aDiscount + oDiscount));
    }

    public double calculateLineItem(int numFruit, Fruit fruit) {
        return fruit.getPrice() * (double) numFruit;
    }

    public double calculateDiscount(int numFruit, Fruit fruit) {
        return ((numFruit / fruit.getDiscountQuantity()) * fruit.getDiscountValue());
    }
}

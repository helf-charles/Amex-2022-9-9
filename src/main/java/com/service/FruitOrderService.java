package com.service;

import com.entity.Order;
import com.enums.Fruit;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

@Service
public class FruitOrderService {

    private static final DecimalFormat df = new DecimalFormat("0.00");

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
        double result = ((aTotal + oTotal) - (aDiscount + oDiscount));
        BigDecimal bd = new BigDecimal(String.valueOf(result));
        bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public double calculateLineItem(int numFruit, Fruit fruit) {
        return fruit.getPrice() * (double) numFruit;
    }

    public double calculateDiscount(int numFruit, Fruit fruit) {
        return ((numFruit / fruit.getDiscountQuantity()) * fruit.getDiscountValue());
    }
}

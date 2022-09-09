package com.service;

import com.enums.Fruit;
import org.springframework.stereotype.Service;

@Service
public class FruitOrderService {
    public String orderFruit(int numOranges, int numApples) {
        if ((numOranges < 0) || (numApples < 0)) {
            return "Negative quantities detected";
        }
        double oTotal = calculateTotal(numOranges, Fruit.ORANGE);
        double aTotal = calculateTotal(numApples, Fruit.APPLE);
        double oDiscount = calculateDiscount(numOranges, Fruit.ORANGE);
        double aDiscount = calculateDiscount(numApples, Fruit.APPLE);
        double orderTotal = (aTotal + oTotal) - (oDiscount + aDiscount);
        return "{\n\"Apples\":" + numApples + ",\n\"AppleTotal\":" + aTotal + ",\n\"AppleDiscount\":" + aDiscount
                +",\n\"Oranges\":" + numOranges + ",\n\"OrangeTotal\":" + oTotal + ",\n\"OrangeDiscount\":" + oDiscount
                +",\n\"OrderTotal\":" + orderTotal + "}";
    }

    private double calculateTotal(int numFruit, Fruit fruit) {
        return fruit.getPrice() * numFruit;
    }

    public double calculateDiscount(int numFruit, Fruit fruit) {
        return (numFruit / fruit.getDiscountQuantity()) * fruit.getDiscountValue();
    }
}

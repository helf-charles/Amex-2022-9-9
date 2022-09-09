package com.service;

import com.enums.Fruit;
import org.springframework.stereotype.Service;

@Service
public class FruitOrderService {
    public String orderFruit(int numOranges, int numApples) {
        double oTotal = Fruit.ORANGE.getPrice() * numOranges;
        double aTotal = Fruit.APPLE.getPrice() * numApples;
        double orderTotal = aTotal + oTotal;
        return "{\n\"Apples\":" + numApples + ",\n\"AppleTotal\":" + aTotal
                +",\n\"Oranges\":" + numOranges + ",\n\"OrangeTotal\":" + oTotal
                +",\n\"OrderTotal\":" + orderTotal + "}";
    }
}

package com;

import com.entity.Order;
import com.enums.Fruit;
import com.repository.FruitOrderRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DBPreLoader {
    CommandLineRunner preloadDB(FruitOrderRepository fror) {
        fror.save(new Order(1, Fruit.APPLE.getVersion(), 2, Fruit.ORANGE.getVersion(), 1.1));
        return args -> {
            System.out.println("Preloaded!");
        };
    }
}

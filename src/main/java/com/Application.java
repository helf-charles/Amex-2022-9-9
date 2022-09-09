package com;

import com.service.FruitOrderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.repository")
@SpringBootApplication
public class Application {
    public static void main(String args[]) {
        SpringApplication.run(Application.class, args);
        FruitOrderService fso = new FruitOrderService();
        fso.calculateTotal(14, 9);
    }

}

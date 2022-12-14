package com.controller;

import com.entity.Order;
import com.repository.FruitOrderRepository;
import com.service.FruitOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class FruitOrderController {

    @Autowired
    private final FruitOrderRepository fror;

    FruitOrderController(FruitOrderRepository fror) {
        this.fror = fror;
    }

    @Autowired
    private FruitOrderService fos;

    @RequestMapping("/")
    public String rootMapping() {
        return "You've reached the Fruit Order homepage!" +
                "\nSorry, we're still working on the website layout." +
                "\nIn the meantime, please feel free to order using our intuitive API!";
    }

    @GetMapping("/orderFruit")
    public Order orderFruit(@RequestParam(value = "numApples", defaultValue = "0") int numOranges,
                            @RequestParam(value = "numOranges", defaultValue = "0") int numApples) {
        return fror.save(fos.orderFruit(numApples, numOranges));
    }

    @GetMapping("/findOrder")
    public Optional<Order> findOrderById(@RequestParam(value = "orderId", defaultValue = "0") long orderId) {
        return fror.findById(orderId);
    }

    @GetMapping("/findAllOrders")
    public List<Order> findAllOrders() {
        return fror.findAll();
    }
}

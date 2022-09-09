package service;

import com.entity.Order;
import com.service.FruitOrderService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FruitOrderServiceTest {

    FruitOrderService fos = new FruitOrderService();

    @Test
    public void shouldCalculateCorrectTotals() {
        Order expected = new Order(1, 1.0, 2, 1.0, 1.1);
        Order result = fos.orderFruit(1, 2);
        Assertions.assertEquals(expected.getTotal(), result.getTotal());
    }

    @Test
    public void shouldNotAllowNegativeValues() {
        Order result = fos.orderFruit(-1, -2);
        Assertions.assertEquals(null, result);
    }

    @Test
    public void shouldCalculateCorrectTotalsWithDiscounts() {
        Order expected = new Order(2, 1.0, 3, 1.0, 1.1);
        Order result = fos.orderFruit(2, 3);
        Assertions.assertEquals(expected.getTotal(), result.getTotal());
    }

    @Test
    public void shouldCalculateCorrectTotalsAtHighOrderQuantities() {
        Order expected = new Order(14, 1.0, 9, 1.0, 5.7);
        Order result = fos.orderFruit(14, 9);
        Assertions.assertEquals(expected.getTotal(), result.getTotal());
    }
}

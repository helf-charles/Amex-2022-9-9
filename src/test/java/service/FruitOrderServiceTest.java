package service;

import com.entity.Order;
import com.service.FruitOrderService;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class FruitOrderServiceTest {

    FruitOrderService fos = new FruitOrderService();

    @Test
    public void shouldCalculateCorrectTotals() {
        Order expected = new Order(1, 1.0, 2, 1.0, 1.1);
        Order result = fos.orderFruit(1, 2);
        assertEquals(expected.getTotal(), result.getTotal());
    }

    @Test
    public void shouldNotAllowNegativeValues() {
        Order result = fos.orderFruit(-1, -2);
        assertEquals(null, result);
    }

    @Test
    public void shouldCalculateCorrectTotalsWithDiscounts() {
        Order expected = new Order(2, 1.0, 3, 1.0, 1.1);
        Order result = fos.orderFruit(2, 3);
        assertEquals(expected.getTotal(), result.getTotal());
    }

    @Test
    public void shouldCalculateCorrectTotalsAtHighOrderQuantities() {
        Order expected = new Order(14, 1.0, 9, 1.0, 5.7);
        Order result = fos.orderFruit(14, 9);
        assertEquals(expected.getTotal(), result.getTotal());
    }
}

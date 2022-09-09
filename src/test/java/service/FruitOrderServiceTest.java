package service;

import com.service.FruitOrderService;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class FruitOrderServiceTest {

    FruitOrderService fos = new FruitOrderService();

    @Test
    public void shouldCalculateCorrectTotals() {
        String result = fos.orderFruit(2, 1);
        assertEquals(result, "{\n\"Apples\":" + 1 + ",\n\"AppleTotal\":" + 0.6 + ",\n\"AppleDiscount\":" + 0.0
                +",\n\"Oranges\":" + 2 + ",\n\"OrangeTotal\":" + 0.5 + ",\n\"OrangeDiscount\":" + 0.0
                +",\n\"OrderTotal\":" + 1.1 + "}");
    }

    @Test
    public void shouldNotAllowNegativeValues() {
        String result = fos.orderFruit(-1, -2);
        assertTrue(result.equals("Negative quantities detected"));
    }

    @Test
    public void shouldCalculateCorrectDiscounts() {
        String result = fos.orderFruit(4, 2);
        assertEquals(result, "{\n\"Apples\":" + 2 + ",\n\"AppleTotal\":" + 1.2 + ",\n\"AppleDiscount\":" + 0.6
                +",\n\"Oranges\":" + 4 + ",\n\"OrangeTotal\":" + 1.0 + ",\n\"OrangeDiscount\":" + 0.25
                +",\n\"OrderTotal\":" + 1.35 + "}");
    }
}

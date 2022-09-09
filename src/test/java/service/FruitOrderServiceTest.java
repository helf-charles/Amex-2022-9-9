package service;

import com.service.FruitOrderService;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class FruitOrderServiceTest {

    FruitOrderService fos = new FruitOrderService();

    @Test
    public void shouldCalculateCorrectTotals() {
        String result = fos.orderFruit(1, 2);
        assertTrue(result.equals("{\n\"Apples\":" + 2 + ",\n\"AppleTotal\":" + 1.2
                +",\n\"Oranges\":" + 1 + ",\n\"OrangeTotal\":" + 0.25
                +",\n\"OrderTotal\":" + 1.45 + "}"));
    }
}

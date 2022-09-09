package controller;

import com.Application;
import com.controller.FruitOrderController;
import com.entity.Order;
import com.repository.FruitOrderRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Application.class)
@AutoConfigureMockMvc
public class FruitOrderControllerTest {

    @Autowired
    private FruitOrderController foc;

    @Autowired
    private FruitOrderRepository fror;

    @Test
    public void shouldReturnHomePage() throws Exception {
        String response = foc.rootMapping();
        Assertions.assertEquals("You've reached the Fruit Order homepage!" +
                "\nSorry, we're still working on the website layout." +
                "\nIn the meantime, please feel free to order using our intuitive API!", response);
    }

    @Test
    public void shouldPlaceOneOrder() throws Exception {
        Order response = foc.orderFruit(7,3);
        Assertions.assertEquals(2.45, response.getTotal());
    }
}

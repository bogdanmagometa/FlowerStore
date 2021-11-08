package order;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FastOrderConstructorTest {
    Order order;

    @Test
    void createOrder() {
        order = FastOrderConstructor.createOrder(FastOrderConstructor.TULIP_PACK_10);
        assertEquals(1, order.getNumItems());
    }
}
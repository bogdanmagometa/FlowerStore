package delivery;

import flowerstore.Flower;
import flowerstore.FlowerType;
import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DHLDeliveryStrategyTest {
    Delivery delivery;
    List<Item> items;
    @BeforeEach
    void setUp() {
        List<Item> items = new ArrayList<>();
        items.add(new Flower(FlowerType.TULIP));
        delivery = new DHLDeliveryStrategy();
    }

    @Test
    void deliver() {
        delivery.deliver(items);
    }
}
package delivery;

import flowerstore.Flower;
import flowerstore.FlowerType;
import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PostDeliveryStrategyTest {
    Delivery delivery;
    List<Item> items;
    @BeforeEach
    void setUp() {
        List<Item> items = new ArrayList<>();
        items.add(new Flower(FlowerType.CHAMOMILE));
        items.add(new Flower(FlowerType.TULIP));
        items.add(new Flower(FlowerType.ROSE));
        delivery = new PostDeliveryStrategy();
    }

    @Test
    void deliver() {
        delivery.deliver(items);
    }
}
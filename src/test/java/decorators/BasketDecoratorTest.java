package decorators;

import flowerstore.Flower;
import flowerstore.FlowerType;
import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasketDecoratorTest {
    Item item;
    @BeforeEach
    void setUp() {
        Flower flower = new Flower(FlowerType.ROSE);
        flower.setPrice(100);
        item = new BasketDecorator(flower);
    }

    @Test
    void getPrice() {
        assertEquals(104, item.getPrice());
    }
}
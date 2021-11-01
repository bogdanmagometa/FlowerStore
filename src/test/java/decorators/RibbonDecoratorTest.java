package decorators;

import flowerstore.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RibbonDecoratorTest {
    Item item;
    Item itemPack;
    @BeforeEach
    void setUp() {
        Flower flower = new Flower(FlowerType.ROSE);
        flower.setPrice(100);
        item = new RibbonDecorator(flower);

        FlowerPack flowerPack = new FlowerPack(FlowerType.CHAMOMILE);
        flowerPack.setPricePerPiece(123);
        flowerPack.setAmount(10);
        itemPack = new RibbonDecorator(flowerPack);
    }

    @Test
    void getPrice() {
        assertEquals(140, item.getPrice());
    }


    @Test
    void getPricePack() {
        assertEquals(123 * 10 + 40, itemPack.getPrice());
    }
}
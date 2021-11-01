package decorators;

import flowerstore.Flower;
import flowerstore.FlowerType;
import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemDecoratorTest {
    Item paperRibbonItem;
    Item paperBasketItem;
    Item basketRibbonItem;
    @BeforeEach
    void setUp() {
        Flower tulip = new Flower(FlowerType.TULIP);
        tulip.setPrice(10);
        paperRibbonItem = new PaperDecorator(new RibbonDecorator(tulip));

        Flower rose = new Flower(FlowerType.ROSE);
        rose.setPrice(1);
        paperBasketItem = new PaperDecorator(new BasketDecorator(rose));

        Flower chamomile = new Flower(FlowerType.CHAMOMILE);
        chamomile.setPrice(5);
        basketRibbonItem = new BasketDecorator(new RibbonDecorator(chamomile));
    }

    @Test
    void getPricePaperRibbon() {
        assertEquals(10 + 13 + 40, paperRibbonItem.getPrice());
    }

    @Test
    void getPricePaperBasket() {
        assertEquals(1 + 13 + 4, paperBasketItem.getPrice());
    }

    @Test
    void getPriceBasketRibbon() {
        assertEquals(5 + 4 + 40, basketRibbonItem.getPrice());
    }
}
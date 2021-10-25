package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {
    Store store;
    Flower flower1;
    Flower flower2;
    Flower flower3;

    @BeforeEach
    void setUp() {
        store = new Store();

        flower1 = new Flower(FlowerType.ROSE);
        flower1.setColor(new int[] {1, 66, 101});
        flower2 = new Flower(FlowerType.TULIP);
        flower2.setColor(new int[] {105, 124, 195});
        flower3 = new Flower(FlowerType.ROSE);
        flower3.setColor(new int[] {4, 0, 255});

        store.addFlower(flower1);
        store.addFlower(flower2);
        store.addFlower(flower3);
    }

    @Test
    void search() {
        Flower found_flower = store.search(null, new int[] {1, 66, 101});
        assertEquals(flower1, found_flower);
    }

    @Test
    void addFlower() {
        Flower fav_flower = new Flower(FlowerType.CHAMOMILE);
        fav_flower.setColor(new int[] {1, 66, 101});

        Flower found_flower = store.search(FlowerType.CHAMOMILE, new int[] {1, 66, 101});
        assertNull(found_flower);

        store.addFlower(fav_flower);

        found_flower = store.search(FlowerType.CHAMOMILE, new int[] {1, 66, 101});
        assertEquals(fav_flower, found_flower);
    }
}
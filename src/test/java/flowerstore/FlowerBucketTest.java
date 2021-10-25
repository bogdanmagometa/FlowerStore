package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerBucketTest {
    FlowerBucket flowerBucket;

    @BeforeEach
    void setUp() {
        flowerBucket = new FlowerBucket();
        FlowerPack flowerPack = new FlowerPack(FlowerType.TULIP);
        flowerPack.setAmount(123);
        flowerPack.setPricePerPiece(1);
        flowerBucket.addFlowerPack(flowerPack);
    }

    @Test
    void addFlowerPack() {
        FlowerPack flowerPack = new FlowerPack(FlowerType.ROSE);
        flowerPack.setAmount(1);
        flowerPack.setPricePerPiece(44);
        flowerBucket.addFlowerPack(flowerPack);
        assertEquals(flowerPack, flowerBucket.flowerPacks.get(1));
    }

    @Test
    void getPrice() {
        assertEquals(123 * 1, flowerBucket.getPrice());
    }
}
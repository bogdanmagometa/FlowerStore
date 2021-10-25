package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerPackTest {
    FlowerPack flowerPack;

    @BeforeEach
    void setUp() {
        flowerPack = new FlowerPack(FlowerType.ROSE);
        flowerPack.setPricePerPiece(123);
        flowerPack.setAmount(2);
        flowerPack.setColor(new int[] {255, 255, 255});
    }

    @Test
    void setPricePerPiece() {
        flowerPack.setPricePerPiece(124);
        assertEquals(124, flowerPack.getPricePerPiece());
    }

    @Test
    void getPricePerPiece() {
        assertEquals(123, flowerPack.getPricePerPiece());
    }

    @Test
    void setColor() {
        flowerPack.setColor(new int[] {0, 0, 0});
        assertArrayEquals(new int[] {0, 0, 0}, flowerPack.getColor());
    }

    @Test
    void getColor() {
        assertArrayEquals(new int[] {255, 255, 255}, flowerPack.getColor());
    }

    @Test
    void getPrice() {
        assertEquals(2*123, flowerPack.getPrice());
    }

    @Test
    void setAmount() {
        flowerPack.setAmount(199);
        assertEquals(199, flowerPack.getAmount());
    }

    @Test
    void getAmount() {
        assertEquals(2, flowerPack.getAmount());
    }
}
package flowerstore;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {
    private Flower flower;
    private int color[] = new int[]{211, 2, 14};

    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.CHAMOMILE);
        flower.setPrice(10);
        flower.setColor(color);
        flower.setSepalLength(12);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getPrice() {
        assertEquals(10, flower.getPrice());
    }

    @Test
    void getSepalLength() {
        assertEquals(12, flower.getSepalLength());
    }

    @Test
    void getColor() {
        color[0] = 251;
        assertArrayEquals(new int[]{211, 2, 14}, flower.getColor());
    }

    @Test
    void getFlowerType() {
        color[0] = 251;
        assertEquals(FlowerType.CHAMOMILE, flower.getFlowerType());
    }

    @Test
    void setColor() {
        int newColor[] = new int[]{1, 2, 3};
        flower.setColor(newColor);
        assertArrayEquals(newColor, flower.getColor());
    }
}
package flowerstore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Store {
    private List<Flower> flowers = new ArrayList<>();
    public Flower search(FlowerType flowerType, int[] color) {
        for (Flower flower: flowers) {
            if (flowerType != null && flowerType != flower.getFlowerType()) {
                continue;
            }
            if (color != null && !Arrays.equals(color, flower.getColor())) {
                continue;
            }
            return flower;
        }
        return null;
    }
    public void addFlower(Flower flower) {
        flowers.add(flower);
    }
}

package flowerstore;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket extends Item {
    List<FlowerPack> flowerPacks = new ArrayList<>();
    public void addFlowerPack(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }
    public double getPrice() {
        double sumPrice = 0;
        for (FlowerPack flowerPack: flowerPacks) {
            sumPrice += flowerPack.getPrice();
        }
        return sumPrice;
    }

    @Override
    public String getDescription() {
        return "Flower bucket " + flowerPacks.toString();
    }
}

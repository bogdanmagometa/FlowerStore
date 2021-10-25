package flowerstore;

import lombok.Getter;

public class FlowerPack {
    private Flower flower;
    @Getter
    private int amount;

    public FlowerPack(FlowerType flowerType) {
        this.flower = new Flower(flowerType);
    }
    public void setPricePerPiece(double price) {
        this.flower.setPrice(price);
    }
    public double getPricePerPiece() {
        return this.flower.getPrice();
    }
    public void setColor(int color[]) {
        this.flower.setColor(color);
    }
    public int[] getColor() {
        return this.flower.getColor();
    }
    public double getPrice() {
        return flower.getPrice() * amount;
    }
    public void setAmount(int amount) {
        if (amount < 1) {
            amount = 1;
        }
        this.amount = amount;
    }
}

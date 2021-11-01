package flowerstore;

import lombok.Getter;

public class FlowerPack extends Item {
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
    public void setColor(int[] color) {
        this.flower.setColor(color);
    }
    public int[] getColor() {
        return this.flower.getColor();
    }
    public double getPrice() {
        return flower.getPrice() * amount;
    }

    @Override
    public String getDescription() {
        return String.format("Flower pack of %d flowers of type ", amount) + flower.getFlowerType();
    }

    public void setAmount(int amount) {
        if (amount < 1) {
            amount = 1;
        }
        this.amount = amount;
    }
}

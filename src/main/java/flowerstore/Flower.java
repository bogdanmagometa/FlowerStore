package flowerstore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

@ToString
public class Flower {
    @Getter @Setter
    private double price;
    @Getter @Setter
    private double sepalLength;
    @Getter
    private int[] color = new int[3];
    @Getter
    private FlowerType flowerType;

    public void setColor(int[] color) {
        this.color = Arrays.copyOf(color, color.length);
    }

    public Flower(FlowerType flowerType) {
        this.flowerType = flowerType;
    }

}

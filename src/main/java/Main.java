import flowerstore.Flower;
import flowerstore.FlowerType;

public class Main {
    public static void main(String[] args) {
        Flower[] flowers = new Flower[3];
        int[] color = {127, 0, 0};
        for (int i = 0; i < flowers.length; i++) {
            flowers[i] = new Flower(FlowerType.TULIP);
            flowers[i].setColor(color);
        }
        for (Flower flower: flowers) {
            System.out.println(flower);
        }

        color[1] = 127;
        for (Flower flower: flowers) {
            System.out.println(flower);
        }
    }
}

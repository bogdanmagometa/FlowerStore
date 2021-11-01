package delivery;

import flowerstore.Item;

import java.util.List;

public class PostDeliveryStrategy implements Delivery {
    public void deliver(List<Item> items) {
        System.out.println("Delivering " + items + " using regular past");
    }
}

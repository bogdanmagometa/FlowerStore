package delivery;

import flowerstore.Item;

import java.util.List;

public class DHLDeliveryStrategy implements Delivery {
    public void deliver(List<Item> items) {
        System.out.println("Delivering " + items + " via DHL");
    }
}

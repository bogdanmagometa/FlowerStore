package order;

import flowerstore.Flower;
import flowerstore.FlowerType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import users.Receiver;
import users.Sender;
import users.User;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    Order order;
    User user1;
    @BeforeEach
    void setUp() {
        order = new Order();
        user1 = new Receiver();
        order.addUser(user1);
    }

    @Test
    void addUser() {
        order.addUser(new Sender());
        assertEquals(2, order.getNumUsers());
    }

    @Test
    void removeUser() {
        order.removeUser(user1);
        assertEquals(0, order.getNumUsers());

    }

    @Test
    void notifyUsers() {
        order.notifyUsers();
    }

    @Test
    void order() {
        order.order();
    }

    @Test
    void addItem() {
        Flower fl = new Flower(FlowerType.TULIP);
        order.addItem(fl);
        assertEquals(1, order.getNumItems());
    }
}
package order;

import flowerstore.Item;
import users.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Order {
    final private List<User> users = new ArrayList<>(); // doesn't conform with D.I. principle
    final private List<Item> items = new ArrayList<>();
    public void addUser(User user) {
        users.add(user);
    }
    public void removeUser(User user) {
        users.remove(user);
    }
    public int getNumUsers() {
        return users.size();
    }
    public int getNumItems() {
        return items.size();
    }
    public void notifyUsers() {
        for (User user: users) {
            user.update("Finished ordering " + Arrays.toString(items.toArray()));
        }
    }
    public void order() {
        System.out.println("Ordering");
        notifyUsers();
    }
    public void addItem(Item item) {
        items.add(item);
    }
}

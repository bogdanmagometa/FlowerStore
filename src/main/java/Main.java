import db.Connection;
import flowerstore.Flower;
import flowerstore.FlowerBucket;
import flowerstore.FlowerType;
import order.Order;
import payment.CreditCardPaymentStrategy;
import payment.Payment;
import users.Receiver;
import users.Sender;
import users.User;

public class Main {
    public static void main(String[] args) {
        User user1 = new Receiver();
        User user2 = new Sender();

        System.out.println("ID of user1: " + user1.getId());
        System.out.println("ID of user2: " + user2.getId());

        Order order = new Order();
        order.addUser(user1);
        order.addUser(user2);
        order.addItem(new Flower(FlowerType.TULIP));

        order.order();

        Connection connection = Connection.getConnection();
        System.out.println(connection);
    }
}

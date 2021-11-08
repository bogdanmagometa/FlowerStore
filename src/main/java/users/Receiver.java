package users;

public class Receiver extends User {
    public void update(String status) {
        System.out.format("Receiver received the status: %s\n", status);
    }
}

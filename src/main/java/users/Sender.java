package users;

public class Sender extends User {
    public void update(String status) {
        System.out.format("Sender received the status: %s\n", status);
    }
}

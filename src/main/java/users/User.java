package users;

public abstract class User {
    private static int numUsers = 0;

    private int id;
    public User() {
        id = numUsers;
        numUsers++;
    }

    public int getId() {
        return id;
    }

    abstract public void update(String status);
}

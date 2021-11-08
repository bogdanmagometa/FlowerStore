package db;

import lombok.Getter;
import lombok.Setter;

// Modify to create connection on first call
public class Connection {
    private static Connection thisConnection;

    public static Connection getConnection() {
        if (thisConnection == null) {
            thisConnection = new Connection();
        }

        return thisConnection;
    }

    @Getter @Setter
    private String dbName;
    private Connection() {}
}

package db;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConnectionTest {
    @Test
    void getConnection() {
        Connection con1 = Connection.getConnection();
        assertNotNull(con1);
        Connection con2 = Connection.getConnection();
        assertNotNull(con1);
        Connection con3 = Connection.getConnection();
        assertNotNull(con1);
        assertEquals(con1, con2);
        assertEquals(con2, con3);
        assertEquals(con1, con3);
    }
}
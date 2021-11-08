package users;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User user1;
    User user2;
    User user3;
    List<Integer> usedIdx = new ArrayList<>();
    @BeforeEach
    void setUp() {
        user1 = new Receiver();
        user2 = new Sender();
        user3 = new Receiver();
    }

    @Test
    void getId() {
        usedIdx.add(user1.getId());
        usedIdx.add(user2.getId());
        usedIdx.add(user3.getId());
        assertEquals(usedIdx.size(), new TreeSet<>(usedIdx).size());
    }

    @Test
    void newUser() {
        user1 = new Sender();
        assertFalse(usedIdx.contains(user1.getId()));
    }
}
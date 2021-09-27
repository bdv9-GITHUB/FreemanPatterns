package factory.users;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

class UserTest {

//    @BeforeAll
//    void start() {
//        System.out.println("Start test");
//    }
//
//    @AfterAll
//    void end() {
//        System.out.println("End test");
//    }

    @Test
    @DisplayName("Test User class")
    void getAllUsers() {
        User user1 = new User("Name1", 10, Sex.MALE);
        User user2 = new User("Name2", 15, Sex.FEMALE);

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);

        List<User> exist = User.getAllUsers();

        Assertions.assertEquals(users, exist);
//        Assertions.fail("Test is over");
//        boolean bool = false;
//        Assertions.assertTrue(bool);
    }

}
package Class3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    String userNameInput = "Shahir";
    String userPasswordInput = "88888";

    public static void main(String[] args) {

        User user1 = new User();
        user1.setUserName("Rasyid");
        user1.setUserPassword("54321");

        User user2 = new User();
        user2.setUserName("Amin");
        user2.setUserPassword("12345");

        User user3 = new User();
        user3.setUserName("Kamarul");
        user3.setUserPassword("12345");
        
        User user4 = new User();
        user4.setUserName("Aiman");
        user4.setUserPassword("44323");

        User user5 = new User();
        user5.setUserName("Syamsul");
        user5.setUserPassword("99999");

        List<User> allUsers = new ArrayList<>();
        allUsers.add(user1);
        allUsers.add(user2);
        allUsers.add(user3);
        allUsers.add(user4);
        allUsers.add(user5);
    }
}

        // Rasyid,  54321
        // Amin,    12345
        // Kamarul, 12345
        // Aiman,   44323
        // Syamsul, 99999
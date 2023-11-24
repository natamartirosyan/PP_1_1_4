package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl udi = new UserServiceImpl();

        udi.createUsersTable();

        udi.saveUser("Paul", "Mccartney", (byte) 26);
        udi.saveUser("John", "Lennon", (byte) 28);
        udi.saveUser("Ringo", "Starr", (byte) 28);
        udi.saveUser("George", "Harrison", (byte) 25);

        List<User> list = udi.getAllUsers();
        for (User user : list) {
            System.out.println(user.toString());
        }
        udi.cleanUsersTable();
        udi.dropUsersTable();
    }
}

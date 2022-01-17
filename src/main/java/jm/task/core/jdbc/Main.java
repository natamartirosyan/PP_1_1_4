package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.*;

import java.sql.Connection;
import java.sql.Driver;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl udi = new UserServiceImpl();
//        udi.createUsersTable();
//        udi.saveUser("Paul", "Mccartney", (byte) 26);
//        udi.saveUser("John", "Lennon", (byte) 28);
//        udi.saveUser("Ringo", "Starr", (byte) 28);
//        udi.saveUser("George", "Harrison", (byte) 25);
//        udi.removeUserById(1);
        udi.dropUsersTable();
    }
}

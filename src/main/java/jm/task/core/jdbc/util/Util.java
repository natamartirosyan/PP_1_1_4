package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    public static final String dbURL = "jdbc:mysql://localhost:3306/testdatabase";
    public static final String dbUsername = "root";
    public static final String dbPassword = "root";
    public static Connection getConnection() {
        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(dbURL, dbUsername, dbPassword);     //params: dbURL, dbUsername, dbPassword

        } catch (SQLException e) {
            System.err.println(("Не удалось подключиться"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
}

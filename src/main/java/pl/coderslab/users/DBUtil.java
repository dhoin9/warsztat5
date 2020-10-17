package pl.coderslab.users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    private final static String DB_URL =
            "jdbc:mysql://localhost:3306/workshop2?use_SSL=false&characterEncoding=utf8&serverTimezone=UCT";
    private final static String DB_USERNAME = "root";
    private final static String DB_PASSWORD = "password";

    public static Connection connectDB() throws SQLException {
        Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        return connection;
    }
}


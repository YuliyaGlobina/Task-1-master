package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    public static final String USER_NAME = "preproject";
    public static final String PASSWORD = "Yulek@32";
    public static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    public static final String DRIVER = "org.postgresql.Driver";
    public static Connection connection;

    public Util() {}
    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
            System.out.println("Table connect successfully");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
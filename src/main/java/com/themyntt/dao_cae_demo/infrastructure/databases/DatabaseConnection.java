package com.themyntt.dao_cae_demo.infrastructure.databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String url = "jdbc:mysql://localhost:3306/todo_cae_demo";
    private static final String user = "root";
    private static final String password = "root";

    private static Connection conn;

    public static Connection getConn() {
        if (conn == null) {
            try {
                conn = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return conn;
    }
}

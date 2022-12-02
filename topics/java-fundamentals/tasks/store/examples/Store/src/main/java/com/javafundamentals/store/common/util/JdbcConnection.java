package com.javafundamentals.store.common.util;

import java.sql.*;

public class JdbcConnection {

    private final static String DATABASE_URL = "jdbc:postgresql://localhost:5432/store";
    private final static String DATABASE_USERNAME = "postgres";
    private final static String DATABASE_PASSWORD = "postgres";

    public static Connection getConnection() {
        Connection connection;
        try {
            connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);
        } catch (SQLException e) {
            System.out.println("Error opening connection!");
            connection = null;
        }
        return connection;
    }

    public static void closeConnection(final Connection connection,
                                       final PreparedStatement statement,
                                       final ResultSet resultSet) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                System.out.println("Error closing connection!");
            }
        }
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                System.out.println("Error closing connection!");
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("Error closing connection!");
            }
        }
    }

}

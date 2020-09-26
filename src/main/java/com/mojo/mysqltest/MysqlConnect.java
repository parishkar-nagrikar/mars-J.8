package com.mojo.mysqltest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConnect {
    public static void main(String[] args) throws ClassNotFoundException {
        //Class.forName("com.mysql.jdbc.Driver");
        String user = "root";
        String url = "jdbc:mysql://localhost:3306/soc0";
        String password = "root";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            if (conn != null) {
                System.out.println("Connected to the database");
            }
        } catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
        }
    }
}
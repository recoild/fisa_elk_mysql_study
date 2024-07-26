package com.example.utils;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {

    private static Properties p;
    private static String driver;
    private static String url;
    private static String username;
    private static String password;

    static {
        try {
            p = new Properties();
            System.out.println("DBUtil static block");
            p.load(new FileInputStream("src/main/resources/db.properties"));

            driver = p.getProperty("jdbc.driver");
            System.out.println("DBUtil static block - driver: " + driver);
            Class.forName(driver);

            url = p.getProperty("jdbc.url");
            System.out.println("DBUtil static block - url: " + url);
            username = p.getProperty("jdbc.username");
            System.out.println("DBUtil static block - username: " + username);
            password = p.getProperty("jdbc.password");
            System.out.println("DBUtil static block - password: " + password);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public static Connection getConnection() throws SQLException {

        return DriverManager.getConnection(url, username, password);
    }
}

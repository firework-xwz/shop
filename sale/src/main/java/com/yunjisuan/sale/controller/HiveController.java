package com.yunjisuan.sale.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HiveController {
    public static Connection conn;

    public static boolean hasInitialized() {
        return !(HiveController.conn == null);
    }

    public static boolean initConnection() {
        try {
            Class.forName("org.apache.hive.jdbc.HiveDriver");
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        }

        try {
            HiveController.conn = DriverManager.getConnection("jdbc:hive2://192.168.233.13:10000/test", "leon", "1214");
        }
        catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public static Connection getConnection() {
        return HiveController.conn;
    }
}

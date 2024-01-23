package org.example.GrishaTask.Part2.WorkWithDBFromLaptop;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionToMyDb {

    public static Connection getConnection(String name) {

        final String url = "jdbc:mysql//localhost:3306/" + name; //grishatask_part2
        final String user = "root";
        final String password = "root";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            return connection;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;

    }

    public static Connection getConnection() {

        final String url = "jdbc:mysql//localhost:3306/grishatask_part2";
        final String user = "root";
        final String password = "root";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            return connection;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;

    }
}

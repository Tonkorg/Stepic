package org.example.GrishaTask.Part2.PracticeWithDb;

import java.sql.*;
import java.time.LocalDate;
import java.util.GregorianCalendar;

public class WorkWithTable {

    private final String host = "jdbc:mysql://localhost:3306/mydbtest";
    private final String user = "root";
    private final String password = "root";

    private final String CREATE = "CREATE TABLE ";

    public void createTable(String tableName) {
        String createQuery = CREATE + tableName + " (id INT PRIMARY KEY, name VARCHAR(255))";

        try (Connection connection = DriverManager.getConnection(host, user, password);
             PreparedStatement statement = connection.prepareStatement(createQuery)) {

            statement.execute();
            System.out.println("Table created successfully");

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public void addRowsInCity(int square, String name, String type, LocalDate baseDate, int count)
    {
        {
            String add = "Insert into City(square,name, type,baseDate, count) values (?,?,?,?,?)";
            try (Connection connection = DriverManager.getConnection(host, user, password);PreparedStatement statement = connection.prepareStatement(add)) {

                statement.setInt(1,square);
                statement.setString(2,name);
                statement.setString(3,type);
                statement.setDate(4, Date.valueOf(baseDate));
                statement.setInt(5,count);
                statement.execute();
                System.out.println("all ok");
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    public void editCity(String column, String newValue, String colomnSearch, String valueSearch)
    {
        String UPDATE = "Update city set " + column + " = " + newValue + " where " + colomnSearch + " = " + valueSearch;
        try
                //(Connection connection = DriverManager.getConnection(host, user, password);Statement statement = connection.createStatement();)
        {
            Connection connection = connectTotDb();
            Statement statement = connection.createStatement();
            statement.executeUpdate(UPDATE);
            System.out.println("all ok");
        }
        catch (Exception e)
        {
            System.out.println("Error");
            e.printStackTrace();
        }
    }


    public  Connection connectTotDb()
    {
        try {

            Connection connection = DriverManager.getConnection(host,user,password);
            return   connection;

        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }

        return null;
    }






}

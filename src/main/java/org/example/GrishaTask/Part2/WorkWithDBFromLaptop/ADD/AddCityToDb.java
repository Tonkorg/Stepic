package org.example.GrishaTask.Part2.WorkWithDBFromLaptop.ADD;

import org.example.GrishaTask.Part2.WorkWithDBFromLaptop.ConnectionToMyDb;

import java.sql.*;
import java.time.LocalDate;

public class AddCityToDb {

    final String ADDCITY = "Insert into city(square,name, type,dateStart, count) values (?,?,?,?,?)";


    public void addCity(int square, String name, String type, LocalDate baseDate, int count)
    {
        try(Connection connection = ConnectionToMyDb.getConnection(); PreparedStatement statement = connection.prepareStatement(ADDCITY))
        {
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

package org.example.GrishaTask.Part2.WorkWithDBFromLaptop.DELETE;

import org.example.GrishaTask.Part2.WorkWithDBFromLaptop.ConnectionToMyDb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class DeleteCity {


    public void deleteCity(String name)
    {
        final String DELETECITY = "Delete from table city where name = " + name;
        try(Connection connection = ConnectionToMyDb.getConnection(); Statement statement = connection.createStatement())
        {
            statement.execute(DELETECITY);
        }
        catch (Exception e)
        {
            System.out.println("Не удалось подключиться к базе данных");
        }
    }
}

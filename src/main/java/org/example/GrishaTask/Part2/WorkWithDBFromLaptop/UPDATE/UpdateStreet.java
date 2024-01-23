package org.example.GrishaTask.Part2.WorkWithDBFromLaptop.UPDATE;

import org.example.GrishaTask.Part2.WorkWithDBFromLaptop.ConnectionToMyDb;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateStreet {

    private String UPDATECITY = " Update street set ? = ? where ? = ?";

    public void updateStreet(String field, String newValue, String searchField, String searchValue)
    {
        try(Connection connection = ConnectionToMyDb.getConnection(); PreparedStatement statement = connection.prepareStatement(UPDATECITY))
        {
            statement.setString(1,field);
            statement.setString(2,newValue);
            statement.setString(3,searchField);
            statement.setString(4,searchValue);

            statement.execute();
        }
        catch (Exception e)
        {
            System.out.println("something go wrong while update table street");
        }
    }
}

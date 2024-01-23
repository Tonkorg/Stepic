package org.example.GrishaTask.Part2.WorkWithDBFromLaptop.UPDATE;

import org.example.GrishaTask.Part2.WorkWithDBFromLaptop.ConnectionToMyDb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;

public class UpdateCity {
    private String UPDATECITY = "UPDATE city SET %s = ? WHERE %s = ?";

    public void updateCity(String field, String newValue, String searchField, String searchValue) {
        try (Connection connection = ConnectionToMyDb.getConnection();
             PreparedStatement statement = connection.prepareStatement(String.format(UPDATECITY, field, searchField))) {

            if (!field.equals("id") && !field.equals("count") && !field.equals("square") && !field.equals("dateStart")) {
                statement.setString(1, newValue);
            } else if (field.equals("dateStart")) {
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                try {
                    Date parsedDate = new java.sql.Date(dateFormat.parse(newValue).getTime());
                    statement.setDate(1, parsedDate);
                } catch (ParseException e) {
                    e.printStackTrace();
                    // Handle parsing exceptions
                }
            }

            statement.setString(2, searchValue);

            statement.execute();
        } catch (SQLException e) {
            System.out.println("Something went wrong while updating the city table: " + e.getMessage());
        }
    }
}

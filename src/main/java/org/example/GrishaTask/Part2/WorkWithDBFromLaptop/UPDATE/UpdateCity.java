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

            Object parsedValue = parseValue(field, newValue);
            Object parsedSearchValue = parseValue(field, searchValue);

            statement.setObject(1, parsedValue);
            statement.setObject(2, parsedSearchValue);

            statement.execute();
        } catch (Exception e) {
            System.out.println("Something went wrong while updating the city table: " + e.getMessage());
        }
    }

    private Object parseValue(String field, String value) throws ParseException {
        if (field.equals("dateStart")) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            return new java.sql.Date(dateFormat.parse(value).getTime());
        } else if (field.equals("count") || field.equals("square") || field.equals("id")) {
            return Integer.parseInt(value);
        } else {
            return value;
        }
    }
}

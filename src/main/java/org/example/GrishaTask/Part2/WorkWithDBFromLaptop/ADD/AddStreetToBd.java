package org.example.GrishaTask.Part2.WorkWithDBFromLaptop.ADD;

import org.example.GrishaTask.Part2.WorkWithDBFromLaptop.ConnectionToMyDb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AddStreetToBd {

    final String ADDSTREET = "Insert into street (name, type, CityId) values (?,?,?)";

    public void addStreet(String name, String type, String cityName) {
        try (Connection connection = ConnectionToMyDb.getConnection();
             PreparedStatement statement = connection.prepareStatement(ADDSTREET)) {

            // Execute the query to retrieve the city ID
            ResultSet res = statement.executeQuery("SELECT id FROM city WHERE name = '" + cityName + "'");
            if (res.next()) {  // Move the cursor to the first row
                int cityId = res.getInt("id");

                // Set parameters for the street insertion
                statement.setString(1, name);
                statement.setString(2, type);
                statement.setInt(3, cityId);

                // Execute the street insertion query
                statement.execute();
                System.out.println("Street added successfully.");
            } else {
                System.out.println("City not found for name: " + cityName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

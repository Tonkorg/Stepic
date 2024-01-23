package org.example.GrishaTask.Part2.WorkWithDBFromLaptop.SELECT;

import org.example.GrishaTask.Part2.WorkWithDBFromLaptop.ConnectionToMyDb;

import java.sql.*;

public class SelectAllInformationAboutCity {

    public void selectAllInfoCity(String name) {
        try (Connection connection = ConnectionToMyDb.getConnection();
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM city WHERE name = ?");
             Statement streetStatement = connection.createStatement()) {

            statement.setString(1, name);
            ResultSet res = statement.executeQuery();

            while (res.next()) {
                int id = res.getInt("id");
                String names = res.getString("name");
                String type = res.getString("type");
                int count = res.getInt("count");
                int square = res.getInt("square");
                Date date = res.getDate("dateStart");

                ResultSet ress = streetStatement.executeQuery("SELECT * FROM street WHERE id =" + id);
                System.out.println("ID:" + id + " Название города:" + names + " тип: " + type + " Количество жителей: "
                        + count + " площадь" + " дата создания: " + date.toString());

                while (ress.next()) {
                    int sid = ress.getInt("id");
                    String sname = ress.getString("name");
                    String stype = ress.getString("type");
                    System.out.println(" Тип улицы" + stype + " название: " + sname);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the exception appropriately (log it, throw it, etc.)
        }
    }
}

package org.example.GrishaTask.Part2.WorkWithDB;

import java.sql.*;

public class Test {


    static String  url = "jdbc:mysql://localhost:3306/mydbtest";
    static String user = "root";
    private static final String Delete = "Delete from dish where id=?";

    static String password = "root";
    public static void main(String[] args) {




        {
            try( Connection connection = DriverManager.getConnection(url,user,password); Statement statement = connection.createStatement();) {

//                statement.execute("insert into users(name,age,email) values('Tom',21,'Aty@gmail.com')"); // метод для добавления
//                statement.executeUpdate("Update users set name= 'Cloe' where id =2;"); // метод для обновления
//                ResultSet res = statement.executeQuery("select * from users"); // метод который возвращает значения только надо обязательно присваить, он ничего не возвращает
//                //System.out.println(res);
//
//                statement.addBatch("insert into users(name,age,email) values('Tom',21,'Aty@gmail.com')"); // создане очередей из запросов
//                statement.addBatch("insert into users(name,age,email) values('Tom',21,'Aty@gmail.com')");
//                statement.addBatch("insert into users(name,age,email) values('Tom',21,'Aty@gmail.com')");
//
//                statement.executeBatch(); // запук всех запросов сразу
//                statement.clearBatch();//очистка очереди
//                //statement.getConnection(); // подключение к бд
//                //statement.close(); // необязательный метод так как все завернуто в трай и он автоматически закрывается

                PreparedStatement preparedStatement = connection.prepareStatement("Cюда вводим наш запрос sql но можно сделать иначе немного");
                //private static final String Delete = "Delete from dish where id=?"; Типо такого и потом указываем данные вместо ? значка
                preparedStatement.setInt(1,2); // Можно разные типы

                final var resultSet = statement.executeQuery("Select * from users");

                while (resultSet.next())
                {
                    String name = resultSet.getString("name");
                    System.out.println(name);

                }


            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }


    }
}

package org.example.GrishaTask.Part2.PracticeWithDb;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        WorkWithTable workWithTable = new WorkWithTable();
        //workWithTable.createTable("City");
        workWithTable.addRowsInCity(17000,"Orel","selo", LocalDate.of(1989,12,12),50000);
    }
}

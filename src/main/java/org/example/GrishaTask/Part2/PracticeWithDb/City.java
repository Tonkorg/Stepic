package org.example.GrishaTask.Part2.PracticeWithDb;

import java.time.LocalDate;

public class City {

    private int square;
    private String name;
    private String type;
    private LocalDate baseDate;
    private int count;


    City(int square, String name,String type, LocalDate baseDate, int count)
    {
        this.count =count;
        this.baseDate = baseDate;
        this.square = square;
        this.name = name;
        this.type = type;
    }


    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getBaseDate() {
        return baseDate;
    }

    public void setBaseDate(LocalDate baseDate) {
        this.baseDate = baseDate;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }




}

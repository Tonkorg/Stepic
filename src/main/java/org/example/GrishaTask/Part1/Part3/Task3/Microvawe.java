package org.example.GrishaTask.Part1.Part3.Task3;

public class Microvawe extends Electricity{

    private double power;
    private boolean status;


    @Override
    public double getPower() {
        return power;
    }

    @Override
    public void setPower(double power) {
        this.power = power;
    }

    Microvawe(double power )
    {
        super();
        this.power = power;
    }

    Microvawe()
    {

    }

    @Override
    public void turnOnOff()
    {
        status = !status;
        if(status) System.out.println("Включение микроволновки...");
        else System.out.println("Выключение микроволновки...");
    }
}

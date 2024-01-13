package org.example.GrishaTask.Part1.Part3.Task3;

public class Electricity {

    private double power;
    private boolean status = false;

    Electricity(int power)
    {
        power = power;
    }
    Electricity()
    {

    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public void turnOnOff()
    {
        status = !status;
        if(status) System.out.println("Включение прибора...");
        else System.out.println("Выключение прибора");
    }
}

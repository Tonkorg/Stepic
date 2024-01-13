package org.example.GrishaTask.Part1.Part3.Task3;

public class Kettle extends Electricity {

    private double power;
    private boolean status = false;

    Kettle(double power)
    {
        super();
        this.power = power;
    }
    Kettle(){}


    @Override
    public double getPower() {
        return power;
    }

    @Override
    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public void turnOnOff()
    {
        status = !status;
        if(status) System.out.println("Включение чайника...");
        else System.out.println("Выключение чайника...");
    }
}

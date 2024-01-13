package org.example.GrishaTask.Part1.Part3.Task2;

import java.util.Random;

public class Computer {

    private boolean status = false;
    CPU cpu;
    Memory memory;
    Winchester winchester;

    public void TurnOnOff()
    {
        status = !status;
        if(status) System.out.println("Компьютер включен");
        else System.out.println("Компьютер выключен");
    }
    public boolean getStatus()
    {
        return status;
    }

    public boolean Virus()
    {
        Random random = new Random();
        int vir = random.nextInt(2);
        if(vir ==0)
        {
            return false;
        }
        else return true;
    }

    public Computer(int sizeMemory, int sizeWinchester, int CPU)
    {
        cpu = new CPU(CPU);
        memory = new Memory(sizeMemory);
        winchester = new Winchester(sizeWinchester);
    }

    public int getMemory()
    {
        return memory.getSize();
    }
    public int getWinchester()
    {
        return winchester.getSize();

    }

}

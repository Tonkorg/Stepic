package org.example.GrishaTask.Part1.Part3.Task3;

import java.util.Scanner;

public class Main {

    Microvawe microvawe;
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        String[] countAmper =  scanner.nextLine().split(" ");
        String[] countVolt = scanner.nextLine().split(" ");
        int[] amper = new int[countAmper.length];
        int[] volt = new int[countVolt.length];
        int[] powerResaul = new int[amper.length];

        for(int i =0;i< countAmper.length;i++)
        {
            amper[i] = Integer.parseInt(countAmper[i]);
        }
        for(int i =0;i< countVolt.length;i++)
        {
            volt[i] = Integer.parseInt(countVolt[i]);
        }
        for(int i =0;i< countVolt.length;i++)
        {
            powerResaul[i] = amper[i]*volt[i];
        }



        Kettle kettle = new Kettle(powerResaul[0]);
        Microvawe microvawe = new Microvawe(powerResaul[1]);
        int maxPower = scanner.nextInt();

        if(kettle.getPower() + microvawe.getPower()> maxPower)
        {
            double minket = maxPower - kettle.getPower();
            double minmic = maxPower - microvawe.getPower();
            if(minket > minmic)
            {
                kettle.turnOnOff();
            }
            else  microvawe.turnOnOff();
        }

        task: while (true)
        {
            System.out.println("1.Включить чайник \n2) Включить микроволновку\n3)Выход");
            int choice = scanner.nextInt();

            switch (choice)
            {
                case 1: {
                    kettle.turnOnOff();


                    break ;
                }
                case 2: {microvawe.turnOnOff();break;}
                case 3: break task;

            }
        }





    }
}

package org.example.GrishaTask.Part1.Part3.Task2;

public class SecondTask {

    public static void main(String[] args) {
        Computer myComputer = new Computer(1000,100000,1);

        System.out.println( myComputer.getMemory());
        System.out.println(myComputer.getWinchester());
        System.out.println(myComputer.getStatus());
        myComputer.TurnOnOff();
        System.out.println(myComputer.getStatus()) ;
        System.out.println(myComputer.Virus());
    }

}

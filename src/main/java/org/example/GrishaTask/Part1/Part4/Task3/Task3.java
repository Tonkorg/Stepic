package org.example.GrishaTask.Part1.Part4.Task3;




public class Task3 {

    public static void main(String[] args) {


        MyOwnCompare myOwnCompare = q -> q % 13 == 0;

        boolean result = myOwnCompare.compareByMyOwn(26);
        System.out.println(result);
    }
}
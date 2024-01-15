package org.example.GrishaTask.Part1.Part4.Task3;




public class Task3 {

    public static void main(String[] args) {


        MyOwnCompare myOwnCompare = q -> q % 13 == 0;

        boolean result = myOwnCompare.compareByMyOwn(5465466);
        System.out.println(result);

        MyOwnCompare myOwnCompare1 = q -> q%121 ==0;
        boolean result1 = myOwnCompare1.compareByMyOwn(121);
        System.out.println(result1);
    }
}
package org.example.GrishaTask.Part1.Part4.Task5;

public class Task5 {

    public static void main(String[] args) {

        MyInterface myInterface = x ->
        {
            int first = 0;
            int second = 1;
            while(second<=x) {
                 if (x == 1) {
                    return true;
                }
                if (x == first + second) {
                    return true;
                }
                int temp = first;
                first = second;
                second = first +temp;

            }
            return false;
        };

        boolean res = myInterface.isFibonachi(21);
        System.out.println(res);

    }
}

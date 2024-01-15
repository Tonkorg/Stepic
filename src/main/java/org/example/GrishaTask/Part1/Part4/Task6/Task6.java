package org.example.GrishaTask.Part1.Part4.Task6;

import java.util.function.Predicate;

public class Task6 {

    public static void main(String[] args) {

        Predicate<Integer> myPredicate = num->
        {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        };


        System.out.println(myPredicate.test(11));
    }
}

package org.example.GrishaTask.Part1.Part4.Task7;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class Task7 {

    public static void main(String[] args) {
        int oddCount = 0;
        int notOddCount = 0;

        Function<String, Integer> getLength = String::length;

        Predicate <String> oddOrNot = s -> (s.toLowerCase().matches("^[aeiou].*"));

        String[] strings = new Scanner(System.in).nextLine().split(" ");

        for(String ss: strings)
        {
            boolean res = oddOrNot.test(ss);
            if(res)
            {
                oddCount++;
            }
            else notOddCount++;
        }

    }
}

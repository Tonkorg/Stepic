package org.example.GrishaTask.Part1.Part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FourTask {

    /**
     *
     * Прочитать с консоли предложения и вывести все слова максималльной и минамальной длины
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input = input.replaceAll("[^а-яА-Я\\s]", "").replaceAll("  "," ");
        System.out.println(input);
        String[] words = input.split(" ");
        //.replaceAll("[^a-zA-Z\\s]", "")
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        ArrayList<String> maxValue = new ArrayList<>();
        ArrayList<String> minValue = new ArrayList<>();


        for(int i =0; i<words.length;i++)
        {
            if(words[i].length()>max)
            {
                max = words[i].length();
                maxValue.clear();
                maxValue.add(words[i]);

            }
            if(words[i].length()<min)
            {
                min = words[i].length();
                minValue.clear();
                minValue.add(words[i]);
            }
            if(words[i].length()==max)
            {
                maxValue.add(words[i]);
            }
            if(words[i].length()==min)
            {
                minValue.add(words[i]);
            }
        }
        System.out.println("Min value:" + Arrays.toString(minValue.toArray())+ "\n" + "Max value:" + Arrays.toString(maxValue.toArray()));

    }
}

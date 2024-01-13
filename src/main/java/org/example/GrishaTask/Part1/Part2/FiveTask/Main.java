package org.example.GrishaTask.Part1.Part2.FiveTask;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String [] str = new Scanner(System.in).nextLine().split(" ");

        Sentence sc = new Sentence(str);

        System.out.println(sc.getWordCount());
        System.out.println(sc.getOriginalSentence());
        System.out.println(sc.getWorldByPosition(2));

    }
}

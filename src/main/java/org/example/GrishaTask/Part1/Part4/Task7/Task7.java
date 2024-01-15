package org.example.GrishaTask.Part1.Part4.Task7;

import java.io.File;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class Task7 {

    public static void main(String[] args) {

        int wordCount = 0;
        int vowelCount = 0;
        int consonantCount = 0;

        try {
            String filePath = "C:\\Users\\Temka\\IdeaProjects\\Stepic\\src\\main\\java\\org\\example\\GrishaTask\\Part1\\Part4\\Task7\\scratch.txt";
                    //"C:\\Users\\Temka\\Documents\\Я_ебал_тестить_чтение файлов_в_джава.txt";
            File file = new File(filePath);

            Predicate<String> startsWithVowel = s -> s.toLowerCase().matches("^[aeiouуеоаыяию].*");
            Function<String[], Integer> getWordCount = words -> words.length;

            String[] words = new Scanner(file).nextLine().split(" ");

            for (String word : words) {
                boolean startsWithVowelResult = startsWithVowel.test(word);
                if (startsWithVowelResult) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }

            wordCount = getWordCount.apply(words);

            System.out.println("Анализ текста.\nВсего слов: " + wordCount +
                    "\nИз них: \nс гласной - " + vowelCount + "\nс согласной - " + consonantCount);

        } catch (Exception e) {
            System.out.println("Ошибка при открытии файла");
        }
    }
}

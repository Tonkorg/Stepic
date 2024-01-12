package org.example.GrishaTask.Part1.Part2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecondTask {

    /**
     * Прочитать с консоли производный текст,
     * содержащий не только буквы, но и цифры и другие символы .
     * Удалить из введеного текста все символы , кроме пробелов,
     * не являющиеся буквами.
     * @param args
     */
    public static void main(String[] args) {

        System.out.println(new Scanner(System.in).nextLine().replaceAll("[^a-zA-Z\\s]", ""));

        //можно было сделать и в много строчек, но мне уже лень заного писать
    }
}

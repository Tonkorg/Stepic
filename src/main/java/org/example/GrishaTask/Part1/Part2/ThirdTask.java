package org.example.GrishaTask.Part1.Part2;
//
//import java.util.Scanner;
//
//public class ThirdTask {
//
//    /**
//     * Замена символов в словах по позиции:
//     * прочитпть с консоли текст из нескольких слов различной длины
//     * прочитать с консоли номер к-позиции символа и новый символ
//     * в каждом слове заменить символ
//     */
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        String[] input = str.split(" ");
//        int number = scanner.nextInt();
//        String simbol = scanner.next();
//
//        for(String s:input)
//        {
//            if(s.length()<number)
//            {
//               for(int i =0; i <s.length();i++)
//               {
//                   if(i == number)
//                   {
//                       s.replace(s[i], simbol);
//                   }
//               }
//            }
//        }
//
//    }
//}
import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст:");
        String str = scanner.nextLine();
        String[] input = str.split(" ");

        System.out.println("Введите позицию символа:");
        int position = scanner.nextInt();

        System.out.println("Введите новый символ:");
        String symbol = scanner.next();

        for (int i = 0; i < input.length; i++) {
            String currentWord = input[i];
            if (position < currentWord.length()) {
                // Создаем новую строку с замененным символом
                String modifiedWord = currentWord.substring(0, position-1) + symbol + currentWord.substring(position);
                input[i] = modifiedWord;
            }
        }

        System.out.println("Результат:");
        for (String s : input) {
            System.out.print(s + " ");
        }
    }
}

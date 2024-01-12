package org.example.GrishaTask.Part1.Part2;

import java.util.Scanner;

public class FirtsTask {
    /**
     * Вычислить ряд фибоначи.
     * Ряд Фибоначи - последовательность чисел б в которой любое
     * число, кроме 1 и 2 является суммой двух предудыщих
     */
    public static void main(String[] args) {



        int first = 0;
        int second = 1;

        Scanner scanner = new Scanner(System.in);
        int  count = scanner.nextInt();
        StringBuilder ab =  new StringBuilder();
        //int resaul = 0;

        for(int i =0; i<count;i++) {
            if (i == 0) {
                first = 0;
                ab.append(0).append(" ");
            } else if (i == 1) {
                ab.append(1).append(" ");
                second = 1;
            } else {
                int temp = second;
                second += first;
                first = temp;
                ab.append(second).append(" ");
            }

        }

        System.out.println(ab.toString());

    }
}

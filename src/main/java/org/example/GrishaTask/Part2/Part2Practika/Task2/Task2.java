package org.example.GrishaTask.Part2.Part2Practika.Task2;

import java.util.Stack;

public class Task2 {

    static class Move {
        int n;
        char from, to, temp;

        Move(int n, char from, char to, char temp) {
            this.n = n;
            this.from = from;
            this.to = to;
            this.temp = temp;
        }
    }

    public static void hanoi(int n, char from, char to, char temp) {
        Stack<Move> stack = new Stack<>();
        stack.push(new Move(n, from, to, temp));

        while (!stack.isEmpty()) {
            Move move = stack.pop();
            if (move.n == 1) {
                System.out.println("Move disk 1 from " + move.from + " to " + move.to);
            } else {
                stack.push(new Move(move.n - 1, move.temp, move.to, move.from));
                stack.push(new Move(1, move.from, move.to, move.temp));
                stack.push(new Move(move.n - 1, move.from, move.temp, move.to));
            }
        }
    }

    public static void main(String[] args) {
        int n = 3; // Количество дисков
        hanoi(n, 'A', 'C', 'B');
    }
}

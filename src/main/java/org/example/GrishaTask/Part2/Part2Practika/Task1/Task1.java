package org.example.GrishaTask.Part2.Part2Practika.Task1;

import java.util.Scanner;
import java.util.Stack;

public class Task1 {
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false; // Нет соответствующей открывающей скобки
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                    return false; // Соответствующая открывающая скобка не соответствует закрывающей
                }
            }
        }

        return stack.isEmpty(); // Если стек пуст, то все скобки сбалансированы
    }

    public static void main(String[] args) {
        String expression1 = "((){[}])";
        String expression2 = "{[(])}";
        String expression3 = "{{[[(())]]}}";

        System.out.println(expression1 + " is balanced: " + isBalanced(expression1)); // true
        //System.out.println(expression2 + " is balanced: " + isBalanced(expression2)); // false
        //System.out.println(expression3 + " is balanced: " + isBalanced(expression3)); // true
    }
}


package org.example.GrishaTask.Part1.Part4.Task1;

public class Task1 {

    public static void main(String[] args) {
        String[][] matrix = fillSpiralMatrix(7, 7);
        printMatrix(matrix);
    }

    public static void printMatrix(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%3s ", array[i][j]);
            }
            System.out.println("");
        }
    }

    public static String[][] fillSpiralMatrix(int m, int n) {
        String[][] matrix = new String[m][n];
        int value = 1;

        int top = 0, bottom = m - 1, left = 0, right = n - 1;

        if (n % 2 != 0) {
            while (top <= bottom && left <= right) {
                // Вправо
                for (int i = left; i <= right; i++) {
                    matrix[top][i] = (left % 2 != 0) ? String.valueOf(value++) : " ";
                }
                top++;

                // Вниз
                for (int i = top; i <= bottom; i++) {
                    matrix[i][right] = (top % 2 == 0) ? String.valueOf(value++) : " ";
                }
                right--;

                // Влево
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = (right % 2 != 0) ? String.valueOf(value++) : " ";
                }
                bottom--;

                // Вверх
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = (bottom % 2 == 0) ? String.valueOf(value++) : " ";
                }
                left++;
            }

            return matrix;
        } else {
            while (top <= bottom && left <= right) {
                // Вправо
                for (int i = left; i <= right; i++) {
                    matrix[top][i] = (left % 2 == 0) ? String.valueOf(value++) : " ";
                }
                top++;

                // Вниз
                for (int i = top; i <= bottom; i++) {
                    matrix[i][right] = (top % 2 == 1) ? String.valueOf(value++) : " ";
                }
                right--;

                // Влево
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = (right % 2 == 0) ? String.valueOf(value++) : " ";
                }
                bottom--;

                // Вверх
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = (bottom % 2 == 1) ? String.valueOf(value++) : " ";
                }
                left++;

            }return matrix;
        }
    }
}

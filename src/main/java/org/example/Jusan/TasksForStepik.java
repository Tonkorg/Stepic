package org.example.Jusan;

public class TasksForStepik {

    public static void main(String[] args) {

        int[] a = {1,2};
        swap(a, 0,1);

    }

    public static void swap(int[] array, int i, int j) {

        int time = array[i];
        array[i] = array[j];
        array[j] = time;

        for(int b=0;b<array.length;b++)
        {
            System.out.print(b+ " ");
        }

    }





}

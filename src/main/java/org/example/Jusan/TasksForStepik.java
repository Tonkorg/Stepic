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


    public static void reverse(int[] array) {
        int[] arr = new int[array.length];
        int count = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            arr[count] = array[i];
            count++;
        }
        // Update the original array with the reversed values
        for (int i = 0; i < array.length; i++) {
            array[i] = arr[i];
        }
    }

    public static int[] join(int[] array1, int[] array2) {

        int[] arr = new int[array1.length+array2.length];

        for(int i =0; i<array1.length; i++)
        {
            arr[i] = array1[i];
        }
        for(int i =0; i<array2.length; i++)
        {
            arr[i+array1.length] = array2[i];
        }


        return arr;
    }



}

package org.example.GrishaTask.Part1.Part3.Task1;

public class FirstTask {


    public static void main(String[] args) {
        int size = 7;

        int[][] array1 = new int[size][size];
        int[][] array2 = new int[size][size];
        int[][] array3 = new int[size][size];
        int[][] array4 = new int[size][size];



        firstMatrix(array1);
        secondMatrix(array2);
        thirdMatrix(array3);
        fourMatrix(array4);

        printMatrix(array1);
        System.out.println("----------------------\n---------------\n--------------------");
        printMatrix(array2);
        System.out.println("----------------------\n---------------\n--------------------");
        printMatrix(array3);
        System.out.println("----------------------\n---------------\n--------------------");
        printMatrix(array4);

    }

    public static void printMatrix(int[][] array)
    {
        for(int i = 0; i< array.length;i++)
        {
            for(int j = 0; j<array[i].length; j++)
            {
                System.out.print(array[i][j] +" ");
            }
            System.out.println("");
        }
    }


    public  static int[][] firstMatrix(int[][] arr)
    {
        for (int i = 0; i< arr.length;i++)
        {
            arr[i][i] =1;
        }

        for(int i =0 ; i< arr.length-1; i++)
        {
            arr[i][arr.length-1-i] = 1;
        }
        return arr;
    }

    public static int[][] secondMatrix(int[][] arr)
    {
        for(int i =0; i < arr.length;i++)
        {
            for(int j = 0; j<arr[i].length;j++)
            {
                if(i == (arr.length-1)/2 || j == (arr.length-1)/2)
                {
                    arr[i][j] =1;
                }
            }
        }
        return arr;
    }

    public static int[][] thirdMatrix(int[][] arr)
    {
        for(int i =0; i < arr.length;i++)
        {
            for(int j = 0; j<arr[i].length;j++)
            {
                if(i == 0 || j==0 || i == arr.length-1 || j == arr.length-1)
                {
                    arr[i][j] =1;
                }
            }
        }
        return arr;
    }

    public static int[][] fourMatrix(int[][] arr)
    {
        for(int i =0; i < arr.length;i++)
        {
            for(int j = 0; j<arr[i].length;j++)
            {
                if (((i==0 || i == arr.length-1)&&j== (arr.length-1)/2) || ((i==1|| i==3)&&(j==1 || j==3)) || (i==2&&(j==0 || j==4)))
                {
                    arr[i][j] =1;
                }
            }
        }
        return arr;
    }
}

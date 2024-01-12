package org.example;


import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world");
        //calc();
        //les1_2();
        //les1_3();
    }


    public static void calc() {

        int a = 10;
        float b = 10f;

        float resplus = a+b;
        float resminus = a-b;
        float resmult = a*b;
        float resdef = a/b;

        System.out.println(resplus +" "+  resminus +" " +  resmult +" " + resdef);

    }

    public static void les1_2()
    {
        boolean a =true;
        boolean b = false;

        System.out.println((a||b) + " " + (a&&b) + " ");
    }

    public static void les1_3()
    {
        int[] mas = new int[30];


        for(int i = 0; i<= mas.length;i++)
        {
           i = (int) (Math.random() *10);
            System.out.print(i);
        }


        for(int i = 1; i<= mas.length;i++)
        {
            if((i-1)%9==0)
            {
                System.out.println();
            }
            System.out.print(i);
        }
    }

    public static void testTreadsWithExebitors() throws  Exception
    {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Callable<Integer> c = () -> {return  15*12;};

        Future<Integer> res = executorService.submit(c);
        while(!res.isDone())
        {
            for (int i = 0 ;i< 1000; i++)
            {
                int f  =21*1212/123*i;
            }
        }
        Integer value = res.get();

    }

    public static void stepicJavaBegginers_2_5_1()
    {
        var res = Math.pow(2,3);
    }

}
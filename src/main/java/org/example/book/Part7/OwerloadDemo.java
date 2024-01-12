package org.example.book.Part7;

public class OwerloadDemo {

    void test()
    {
        System.out.println("Empty test");
    }

    void test(int a)
    {
        System.out.println("Test with a:" + a);
    }

    void test(int a, int b)
    {
        System.out.println("Test with two:" + a + b);
    }
    double test(double a)
    {
        return a*a;
    }
}

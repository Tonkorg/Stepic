package org.example.book.Part6;

public class BoxDemo {

    public static void main(String[] args) {
        Box myBox= new Box();

        myBox.depth = 10;
        myBox.width = 4;
        myBox.height = 12;

        int vol = (int) (myBox.depth * myBox.height * myBox.width);
        System.out.println(vol );
    }
}

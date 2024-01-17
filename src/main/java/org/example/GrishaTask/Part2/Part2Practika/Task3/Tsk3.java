package org.example.GrishaTask.Part2.Part2Practika.Task3;

import java.util.BitSet;

public class Tsk3 {

    public static void main(String[] args) {
        BitSet bitSet = new BitSet(8);

        // Установка битов
        bitSet.set(1);
        bitSet.set(3);
        bitSet.set(5);

//        System.out.println("BitSet: " + bitSet);
//
//        System.out.println("Bit 1 is set? " + bitSet.get(1));
//        System.out.println("Bit 2 is set? " + bitSet.get(2));

        Archer archer = new Archer();

         String res = archer.inCase("AABBCCDD");
        System.out.println(res);
        String s = archer.unCase("01001001101010");
        System.out.println(s);
    }
}

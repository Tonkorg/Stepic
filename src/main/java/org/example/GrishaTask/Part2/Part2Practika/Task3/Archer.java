package org.example.GrishaTask.Part2.Part2Practika.Task3;

import java.util.BitSet;

public class Archer {

    private String st;
    BitSet mySet;

    Archer(String str) {
        st = str;
    }

    Archer() {
    }

    public String inCase(String st) {
        mySet = new BitSet();
        for (int i = 0; i < st.length(); i++) {
            switch (st.charAt(i)) {
                case 'A': {
                    break;
                }
                case 'B': {
                    mySet.set((i * 2) + 1);
                    break;
                }
                case 'C': {
                    mySet.set((i * 2));
                    break;
                }
                case 'D': {
                    mySet.set((i * 2));
                    mySet.set((i * 2) + 1);
                    break;
                }
                default: {
                    System.out.println("Нет символа в алховите");
                    try {
                        throw new Exception("F");
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        return Archer.convertBitSetToString(mySet);
    }

    public String unCase(String bitsetString) {
        BitSet bb = Archer.convertStringToBitSet(bitsetString);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < bb.length(); i += 2) {
            if (!bb.get(i)) {
                if (!bb.get(i + 1)) {
                    sb.append('A');
                } else {
                    sb.append('B');
                }
            } else {
                if (bb.get(i + 1)) {
                    sb.append('D');
                } else {
                    sb.append('C');
                }
            }
        }

        return sb.toString();
    }
    private static  String convertBitSetToString(BitSet bitSet) {
        StringBuilder result = new StringBuilder();
        int length = bitSet.length();

        for (int i = 0; i < length; i++) {
            if (bitSet.get(i)) {
                result.append("1");
            } else {
                result.append("0");
            }
        }

        return result.toString();
    }
    private static BitSet convertStringToBitSet(String bitSetString) {
        int length = bitSetString.length();
        BitSet result = new BitSet(length);

        for (int i = 0; i < length; i++) {
            char bitChar = bitSetString.charAt(i);
            if (bitChar == '1') {
                result.set(i);
            }
            // Если символ не '1', оставляем бит с нулевым значением
        }

        return result;
    }
}

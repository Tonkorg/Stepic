package org.example.GrishaTask.Part2.Part2Lection;


import java.lang.reflect.Array;

public class  GenericArrayExample<T>{

        private T[] array;

        public GenericArrayExample(Class<T> type, int size) {
            // Создание массива с использованием рефлексии
            array = (T[]) Array.newInstance(type, size);
        }

        public static void main(String[] args) {
            GenericArrayExample<String> example = new GenericArrayExample<>(String.class, 5);
            String[] strings = example.getArray();

            for (int i = 0; i < strings.length; i++) {
                strings[i] = "Element " + i;
            }

            for (String str : strings) {
                System.out.println(str);
            }
        }

        public T[] getArray() {
            return array;
        }
}


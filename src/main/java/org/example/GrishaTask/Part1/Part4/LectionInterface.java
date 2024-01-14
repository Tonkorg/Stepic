package org.example.GrishaTask.Part1.Part4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LectionInterface {


    public static void main(String[] args) {


        // Интерфейс Predicate - Интерфейс Predicate
        // является частью пакета java.util.function в
        // Java и предоставляет функциональный метод test(T t),
        // который принимает аргумент и возвращает булево значение.
        // Этот интерфейс используется для определения предикатов,
        // которые представляют собой условия, проверяемые на истинность.

        Predicate<Integer> isEven = number -> number%2==0;

        System.out.println(isEven.test(4));  // Вывод: true
        System.out.println(isEven.test(5));  // Вывод: false

        // Пример предиката для проверки, является ли строка непустой
        Predicate<String> isNotEmpty = str -> str != null && !str.isEmpty();

        System.out.println(isNotEmpty.test("Hello"));  // Вывод: true
        System.out.println(isNotEmpty.test(""));       // Вывод: false


        //Интерфейс Function является частью Java API и предоставляет
        // функциональный метод для преобразования входного аргумента в
        // выходной результат. Вот его общая сигнатура:

        // Пример: функция, которая умножает входное число на 2
        Function<Integer, Integer> multiplyByTwo = x -> x * 2;

        int result = multiplyByTwo.apply(5);
        System.out.println(result); // Вывод: 10



        //Интерфейс Consumer также является частью Java API
        // и предоставляет функциональный метод для выполнения операции
        // над входным аргументом, но не возвращает результат. Вот его общая сигнатура:


        Consumer<String> printConsumer = s -> System.out.println(s);

        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // Применение Consumer для вывода каждого элемента списка
        list.forEach(printConsumer);


        //Интерфейс Supplier в Java представляет
        // собой функциональный интерфейс, который
        // не принимает никаких аргументов,
        // но возвращает результат. Он определен следующим образом:

        Supplier<Integer> randomNumberSupplier = () -> (int) (Math.random() * 100) + 1;

        // Получение случайного числа
        int randomValue = randomNumberSupplier.get();
        System.out.println("Случайное число: " + randomValue);


        //В Java, интерфейс Comparator является функциональным интерфейсом,
        // который используется для сравнения двух объектов. Он определен следующим образом:

        Comparator<String> lengthComparator = Comparator.comparingInt(String::length);

        String[] words = {"apple", "banana", "orange", "kiwi", "grape"};

        // Сортировка массива строк по длине с использованием Comparator
        Arrays.sort(words, lengthComparator);

        // Вывод отсортированного массива
        System.out.println(Arrays.toString(words));
    }
    }


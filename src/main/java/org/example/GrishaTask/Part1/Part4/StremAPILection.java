package org.example.GrishaTask.Part1.Part4;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StremAPILection {

    public static void main(String[] args) {


        String[] myArray = {"apple", "banana", "orange", "grape", "kiwi"};
        Stream<String> myStreamFromArray = Arrays.stream(myArray); // создание стрима из массива


        List<String> myList = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
        // Создаем поток из коллекции
        Stream<String> myStream = myList.stream();

        //peek: Операция peek выполняет действие для каждого
        // элемента потока, но в отличие от forEach, peek возвращает
        // поток с теми же элементами. Она может быть полезна для отладки
        // или логирования промежуточных результатов.

        //    .forEach(System.out::println);
        //skip: Операция skip пропускает заданное количество элементов в потоке.
        // Это может быть полезно, например, для пропуска первых N элементов.

        //distinct: Операция distinct возвращает поток с уникальными элементами, убирая дубликаты.

        //educe: Выполняет свертку элементов потока с использованием
        // заданной функции. Возвращает Optional, так как поток может быть пустым.

        Optional<String> concatenated = myList.stream()
                .reduce((s1, s2) -> s1 + s2);



        List<String> collectedList = myList.stream()
                .collect(Collectors.toList());

        long count = myList.stream()
                .count(); // количество элементов в потоке

        Optional<String> minElement = myList.stream()
                .min(Comparator.naturalOrder()); // есть еще revrse order

        Optional<String> maxElement = myList.stream()
                .max(Comparator.naturalOrder());


       // anyMatch, allMatch, noneMatch: Проверяют, соответствует ли хотя
        // бы один, все или ни один элемент условию, заданному предикатом.

        boolean anyMatch = myList.stream()
                .anyMatch(s -> s.startsWith("a"));

        boolean allMatch = myList.stream()
                .allMatch(s -> s.length() > 2);

        boolean noneMatch = myList.stream()
                .noneMatch(s -> s.contains("z"));


        // Генерация 5 случайных целых чисел от 1 до 100
        IntStream randomIntStream = new Random().ints(5, 1, 100);

        // Вывод сгенерированных чисел
        randomIntStream.forEach(System.out::println);

        DoubleStream randomDoubleStream = new Random().doubles(10,1,1000);
        randomDoubleStream.forEach(System.out::println);
    }
}

package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MiddleJavaDevelopeer {

    /**
     * volatile указывает на то, что значение переменной нужно читать и писать в
     * сновную память, в обход кешей и регистров ядра процессора. Это ключевое
     * слово имеет смысл использовать с примитивами, так как при употреблении со
     * ссылочными типами синхронизовано будет только само значение ссылки, а не
     * данные, на которые она указывает.
     */
    volatile int z;

    /**
     * Операция reduce() принимает очень интересную функцию. Она требует два аргумента, первый представляет собой элемент нашего потока, второй аргумент - аккумулятор, куда мы собираем все наши элементы. Сама функция - правило, как сложить первый элемент в аккумулятор.
     *
     * Давайте просуммируем все элементы нашего потока:
     */
    final OptionalInt reduce = IntStream.range(0, 4).reduce((el, acc) -> el + acc);// 6


    /**
     * Позволяет собрать стрим в коллекцию, например, Set или List. Удобно, что уже есть готовые методы для создания коллекции из потока. Посмотрим некоторые примеры.
     */
    Set<Integer> integerSet = Stream.of(1, 2, 3, 4, 5, 4, 3, 2, 1)
            .collect(Collectors.toSet()); // [1, 2, 3, 4, 5]


    //Теперь сделаем мапу с ключами - элементами и значениям - количество вхождений элемента.

            Map<Integer, Integer> integerMap = Stream.of(1, 1, 1, 2, 3, 3, 3, 3, 3)
            .collect(Collectors.toMap(e -> e, e -> 1, Integer::sum));

    /**
     * В Collectors.toMap первым аргументом указали функцию, которая устанавливает ключи в мапе,
     * в данном случае - это просто наши элементы потока. Вторым аргументом - функцию, которая
     * устанавливает значения: нам нужно, чтобы при каждом вхождении элемента в значение клалась 1,
     * третий аргумент отвечает за то, что делать с той 1, которую нам дала вторая функция, здесь мы просто суммируем.
     * Когда обработалась первая единица, по ключу 1 записалась 1, когда обработалась вторая единица,
     * вторая функция e -> 1 тоже пытается записать 1 по ключу 1, и происходит коллизия, потому что у
     * нас уже есть значение по этому ключу. В таком случае будет вызываться третья функция, которая
     * принимает два аргумента: уже установленное значение и новое. Результат выполнения это функции будет
     * записан в значение по ключу, в данном примере sum(1,1).

     */

    /** Итак, допустим у нас есть обычный последовательный стрим. Сделать из него параллельный можно с помощью метода parallel().



//            Stream.of(1, 2, 3)
//            .parallel()
//            .map(e -> e * 2)
//            .forEach(System.out::println); // 2, 6, 4


   // Параллельный стрим можно получить не только


//
//            List.of(1, 2, 3)
//            .parallelStream()
//            .map(e -> e * 2)
//            .forEach(System.out::println); // 6, 4, 2

    /**Посмотрите на порядок вывода: при использовании параллельных стримов нет гарантии, что
     *  обрабатываться элементы будут в том же порядке, в котором они указаны. Более того, порядок
     *  вывода будет меняться от запуска к запуску.
     */




    public static void main(String[] args) {


        //ArrayList<Float> testStreamGenerate = (ArrayList<Float>) Stream.generate(new Random()::nextFloat).limit(10);

        //System.out.println(testStreamGenerate.toString());



        int hell  =121;
        Set<String> something = Set.of("dada", "dqwdd", "efewfw");
        something.stream().sorted().filter(ingres -> ingres.contains("e")).forEach(System.out::println);


    }
    /**
    Для группировки книг по жанру:

    Map<String, List<Book>> byGenre = books.stream()
            .collect(groupingBy(Book::getGenre));

    // byGenre = {Поэма=['Мёртвые души'], Роман=['Евгений Онегин', 'Герой нашего времени'], Повесть=['Шинель']}
    Если нужно получить сумму из свойств сгруппированных элементов, то можно воспользоваться такими методами:

    summingInt()
    summingLong()
    summingDouble()
    Например, для получения суммарного количества страниц во всех книгах в определённом жанре, можно написать такой код:

    Map<String, Integer> totalLengthByGenre = books.stream()
            .collect(groupingBy(Book::getGenre,
                    summingInt(Book::getPageCount)));

    // totalLengthByGenre = {Поэма=560, Роман=576, Повесть=64}
    Можно определить среднее количество страниц в книге в определённом жанре:

    Map<String, Double> averageLength = books.stream()
            .collect(groupingBy(Book::getGenre,
                    averagingInt(Book::getPageCount)));
System.out.println("averageLength: " + averageLength);

    // averageLength: {Поэма=560.0, Роман=288.0, Повесть=64.0}
    Можно собрать статистику о количестве страниц в книгах по жанрам:

    Map<String, IntSummaryStatistics> statisticsByGenre = books.stream()
            .collect(groupingBy(Book::getGenre,
                    summarizingInt(Book::getPageCount)));
    /*
    statisticsByGenre = {
      Поэма=IntSummaryStatistics{
        count=1, sum=560, min=560, average=560.000000, max=560},
      Роман=IntSummaryStatistics{
        count=2, sum=576, min=224, average=288.000000, max=352},
      Повесть=IntSummaryStatistics{
        count=1, sum=64, min=64, average=64.000000, max=64}
    }

    Можно найти самую большую книгу у каждого автора:

    Map<String, Optional<Book>> maxLengthByAuthor = books.stream()
            .collect(groupingBy(Book::getAuthor,
                    maxBy(Comparator.comparingInt(Book::getPageCount))));

    // maxLengthByAuthor = {Пушкин=Optional['Евгений Онегин'], Гоголь=Optional['Мёртвые души'], Лермонтов=Optional['Герой нашего времени']}

     Q
    Обратите внимание, что в результате мы получаем Map, состоящий из Optional. Дело в том, что maxBy и minBy рассчитаны на работу с пустыми коллекциями.
     Соответственно максимума (или минимума) в пустой коллекции не будет. Отсюда и получается Optional.

*/
}

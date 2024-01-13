package org.example.GrishaTask.Part1.Part3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class LectionDate {

    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        // Пользовательский шаблон формата
        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = currentDate.format(customFormatter);
        System.out.println("Форматированная дата: " + formattedDate);


        LocalTime currentTime = LocalTime.now();

        // Пользовательский шаблон формата
        DateTimeFormatter customFormatter1 = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime1 = currentTime.format(customFormatter1);
        System.out.println("Форматированное время: " + formattedTime1);


        LocalDateTime currentDateTime = LocalDateTime.now();

        // Пользовательский шаблон формата
        DateTimeFormatter customFormatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime2 = currentDateTime.format(customFormatter2);
        System.out.println("Форматированная дата и время: " + formattedDateTime2);



            String dateStr = "25-12-2022";

            // Пользовательский шаблон формата
            DateTimeFormatter customFormatter3 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate parsedDate = LocalDate.parse(dateStr, customFormatter3);
            System.out.println("Разобранная дата: " + parsedDate);

        String dateTimeStr = "25-12-2022 15:30:45";

        // Пользовательский шаблон формата
        DateTimeFormatter customFormatter4 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateTimeStr, customFormatter4);
        System.out.println("Разобранная дата и время: " + parsedDateTime);

        LocalDateTime localDateTime = LocalDateTime.now();

        // Форматирование в UTC
        DateTimeFormatter formatterUTC = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss").withZone(ZoneId.of("UTC"));
        String formattedUTC = formatterUTC.format(localDateTime.atZone(ZoneId.of("UTC")));
        System.out.println("Форматированное время в UTC: " + formattedUTC);

        // Форматирование в часовом поясе по умолчанию
        DateTimeFormatter formatterLocal = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedLocal = localDateTime.format(formatterLocal);
        System.out.println("Форматированное локальное время: " + formattedLocal);

        // Форматирование в другом часовом поясе
        DateTimeFormatter formatterNewYork = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss").withZone(ZoneId.of("America/New_York"));
        String formattedNewYork = formatterNewYork.format(localDateTime.atZone(ZoneId.of("America/New_York")));
        System.out.println("Форматированное время в Нью-Йорке: " + formattedNewYork);

        DateTimeFormatter formatterMoscow = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss").withZone(ZoneId.of("Europe/Moscow"));
        String formattedMoscow  = formatterMoscow.format(localDateTime.atZone(ZoneId.of("Europe/Moscow")));
        System.out.println("Форматированное время в Москве: " + formattedNewYork);


        //-----------------------------------------------------------------------------------------------------------------

        LocalDateTime localDateTimeMoscow = LocalDateTime.now();

        // Получение текущего времени в Московском часовом поясе
        ZoneId moscowZone = ZoneId.of("Europe/Moscow");
        LocalDateTime moscowDateTime = localDateTimeMoscow.now(moscowZone);

        // Форматирование времени в Москве
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedMoscowTime = moscowDateTime.format(formatter);

        System.out.println("Текущее время в Москве: " + formattedMoscowTime);
    }

    }




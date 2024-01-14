package org.example.GrishaTask.Part1.Part3.TaskManager;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choice;
        String sent;
        Diary diary = new Diary();
        Scanner scanner = new Scanner(System.in);
        task:
        while (true) {
            System.out.println("1) Считать все записи\n" +
                    "2) Добавить запись\n" +
                    "3) Изменить запись\n" +
                    "4) Показать последнюю запись\n" +
                    "5) Найти запись по дате\n" +
                    "6) Удалить запись\n" +
                    "7) Показать записи по дате\n" +
                    "8)  Выйти");

            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    first:
                    while (true) {
                        System.out.println("Вывести в алфавитном порядке?\n1 - да\n2 - нет");
                        choice = scanner.nextInt();
                        scanner.nextLine(); // Добавьте эту строку для считывания символа новой строки
                        switch (choice) {
                            case 1: {
                                diary.showAll(true);
                                break first;
                            }
                            case 2: {
                                diary.showAll(false);
                                break first;
                            }
                            default:
                                System.out.println("Неверно указано значение");
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.println("Введите запись");
                    scanner.nextLine(); // Добавьте эту строку для считывания символа новой строки
                    sent = scanner.nextLine();
                    diary.createBusinessRecord(sent.split(" "));
                    break;
                }
                case 3: {
                    third:
                    while (true) {
                        System.out.println("Введите по какому критерию хотите менять запись\n1 - по дате\n2- по дате и времени");
                        choice = scanner.nextInt();
                        scanner.nextLine(); // Добавьте эту строку для считывания символа новой строки
                        System.out.println("Введите дату");
                        sent = scanner.nextLine();

                        switch (choice) {
                            case 1: {
                                LocalDate localDate = LocalDate.parse(sent);
                                diary.corectByDate(localDate);
                                break third;
                            }
                            case 2: {
                                LocalDateTime localDateTime = LocalDateTime.parse(sent);
                                diary.corectByDateTime(localDateTime);
                                break third;
                            }
                            default: {
                                System.out.println("Не корректное значение");
                            }
                        }
                    }
                    break;
                }
                case 4: {
                    diary.showLast(1);
                    break;
                }
                case 5: {
                    five:
                    while (true) {
                        System.out.println("Введите по какому критерию хотите искать запись\n1 - по дате\n2- по дате и времени");
                        choice = scanner.nextInt();
                        scanner.nextLine(); // Добавьте эту строку для считывания символа новой строки
                        System.out.println("Введите дату");
                        sent = scanner.nextLine();
                        switch (choice) {
                            case 1: {
                                LocalDate localDate = LocalDate.parse(sent);
                                BusinessRecord result = diary.searchByByDate(localDate);
                                if (result != null) {
                                    System.out.println("Найдена запись: " + result.getOriginalSentence());
                                } else {
                                    System.out.println("Запись не найдена.");
                                }
                                break five;
                            }
                            case 2: {
                                LocalDateTime localDateTime = LocalDateTime.parse(sent);
                                BusinessRecord result = diary.searchByByDateTime(localDateTime);
                                if (result != null) {
                                    System.out.println("Найдена запись: " + result.getOriginalSentence());
                                } else {
                                    System.out.println("Запись не найдена.");
                                }
                                break five;
                            }
                            default: {
                                System.out.println("Не корректное значение");
                            }
                        }
                    }
                    break;
                }
                case 6: {
                    six:
                    while (true) {
                        System.out.println("Введите по какому критерию хотите удалить запись\n1 - по дате\n2- по дате и времени");
                        choice = scanner.nextInt();
                        scanner.nextLine(); // Добавьте эту строку для считывания символа новой строки
                        System.out.println("Введите дату");
                        sent = scanner.nextLine();
                        switch (choice) {
                            case 1: {
                                LocalDate localDate = LocalDate.parse(sent);
                                boolean deleted = diary.delete(localDate);
                                if (deleted) {
                                    System.out.println("Запись удалена.");
                                } else {
                                    System.out.println("Запись не найдена.");
                                }
                                break six;
                            }
                            case 2: {
                                LocalDateTime localDateTime = LocalDateTime.parse(sent);
                                boolean deleted = diary.delete(localDateTime);
                                if (deleted) {
                                    System.out.println("Запись удалена.");
                                } else {
                                    System.out.println("Запись не найдена.");
                                }
                                break six;
                            }
                            default: {
                                System.out.println("Не корректное значение");
                            }
                        }
                    }
                    break;
                }
                case 7: {
                    System.out.println("Введите дату");
                    sent = scanner.nextLine();
                    LocalDateTime localDateTime = LocalDateTime.parse(sent);
                    BusinessRecord result = diary.showByDateTime(localDateTime);
                    if (result != null) {
                        System.out.println("Запись: " + result.getOriginalSentence());
                    } else {
                        System.out.println("Запись не найдена.");
                    }
                    break;
                }
                case 8: {
                    break task;
                }
                default: {
                    System.out.println("Введено некорректное значение!");
                }

            }
        }
    }
}

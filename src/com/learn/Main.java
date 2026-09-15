package com.learn;

import java.lang.Math;
import java.util.Arrays;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        String aa = "dd";
        int intVal = Math.toIntExact(0x80000000);
        boolean nnn = true;//  Комбинация клавиш: Ctrl + Alt + V

        String firstName = "Alex";
        String secondName = "Doe";
        long age = 21L;
        var userInfo = printUserInfo(firstName, secondName, age);
        System.out.println(userInfo);
        System.out.println("\uD83E\uDD21");  // clown face

        String[] strArr = new String[5];
        String[] strArr2 = new String[] {"1", "3"};
        String[] strArr3 = {"1", "3"};
        System.out.println(Arrays.toString(strArr3));
        int[][] i22 = {{1, 2}, {3, 4, 5}, {6, 7, 8, 9}};

        for (int i = 0; i < i22.length; i++) {
            for (int j = 0; j < i22[i].length; j++) {
                System.out.println(i22[i][j]);
            }
        }

        Vector<String> vrtr = new Vector<>();
    }

    public static String describeObject(Object obj) {
        return switch (obj) {
            case null -> "Передан null"; // Обработка null

            // Проверка типа и автоматическое приведение
            case Integer i -> "Целое число: " + i;
            case String s when s.length() > 10 -> "Длинная строка: " + s; // <-- Условия (guard)
            case String s -> STR."Строка: \{s}";
            case java.time.LocalDate d -> "Дата: " + d;

            default -> "Неизвестный тип";
        };
    }

    private static String printUserInfo(String firstName, String secondName, long age) {
        /*return STR."""
                User information:
                    First name: \{firstName}
                    Last name: \{secondName}
                    age: \{age}
                """;*/

/*        return """
        User information:
            First name: %1$s
            Last name: %2$s
            age: %3$d
        """.formatted(firstName, secondName, age);*/

        return """
            User information:
                First name: %s
                Last name: %s
                age: %d
            """.formatted(firstName, secondName, age);
    }

    // просто копируете клоуна, внутри двойных кавычек \r\n жмете ctrl+v и у вас вставится текст "\uD83E\uDD21" \u1F921
//    symbol.cc
//    russellcottrell.com  surrogate pair converter
}

package com.learn;


/**
 * Использовать шаблон psvm: Введите psvm и нажмите Enter. Этот шаблон зарезервирован специально для генерации классической, полной сигнатуры метода.
 *
 * Изменить шаблон (при необходимости): Вы можете проверить настройки шаблонов в File -> Settings -> Editor -> Live Templates (раздел Java)
 * и посмотреть, как настроены шаблоны main и psvm. Но обычно IDEA корректно выбирает нужный вариант в зависимости от того, где именно вы находитесь в коде.
 *
 * Вручную: Просто напишите String[] args в скобках метода.
 *
 * Через горячие клавиши (быстрый фикс): Поставьте курсор на метод main и нажмите Alt+Enter (или Option+Enter на Mac).
 * IDEA предложит быстрое исправление «Add 'String[] args' parameter», которое вернет классическую сигнатуру.
 *
 * https://chat.deepseek.com/a/chat/s/43eb2f9d-e3c6-4c6a-8bb2-13a558c172ef
 */
public class CountChars {
    static void main() {
        String text = "HELLOWORLD";
        int[] result = countChars2(text);
        int lCount = result['O' - 'A'];  // в массиве с 0 индексы а не с 65
        System.out.println(lCount);
    }

    private static int[] countChars(String s) {
        int[] charCount = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //charCount[c - 'A'] = charCount[c - 'A'] + 1;  // increment
            charCount[c - 'A']++;
        }
        return charCount;
    }

    private static int[] countChars2(String s) {
        int[] charCount = new int[26];
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            charCount[c - 'A']++;
        }
        return charCount;
    }
}

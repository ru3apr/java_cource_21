package com.learn;

import java.util.Scanner;

public class ScannerInput {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Для выхода из приложения введите q или exit");
        while (true) {
            String input = scanner.nextLine();
            if ("q".equals(input) || "exit".equals(input)) {
                break;
            }
            System.out.println(STR."Вы ввели:\{input}");
        }
    }

    /*
     Где найти кнопку
Откройте панель «Проект» (обычно слева или Alt+1).

Посмотрите на правый верхний угол этой панели. Там есть значок с тремя точками или шестерёнка (⚙️).

Нажмите на него и снимите галочку с пункта «Always Select Opened File» (Всегда выбирать открытый файл).

После этого кнопка-мишень должна снова появиться на панели инструментов окна «Проект»

https://chat.deepseek.com/a/chat/s/43eb2f9d-e3c6-4c6a-8bb2-13a558c172ef
     */
}

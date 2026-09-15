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
            System.out.println("Вы ввели:" + input);
        }
    }
}

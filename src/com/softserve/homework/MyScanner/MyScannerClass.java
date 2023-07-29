package com.softserve.homework.MyScanner;

import java.util.Scanner;

public class MyScannerClass implements AutoCloseable {
    // Поле для зберігання об'єкту Scanner
    private Scanner scanner;

    // Конструктор класу, в якому ініціалізуємо об'єкт Scanner
    public MyScannerClass() {
        scanner = new Scanner(System.in);
    }

    // Метод для читання цілочисельних значень
    public int readInt() {
        return scanner.nextInt();
    }

    // Метод для читання дійсних (з плаваючою точкою) значень
    public double readDouble() {
        return scanner.nextDouble();
    }

    // Метод для читання рядків
    public String readString() {
        return scanner.nextLine();
    }

    // Метод для читання символів
    public char readChar() {
        return scanner.next().charAt(0);
    }

    // Метод для закриття Scanner після використання
    public void closeScanner() {
        scanner.close();
    }

    @Override
    public void close () throws Exception {

    }
}
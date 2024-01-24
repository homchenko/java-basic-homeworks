package ru.homchenko.java.basic.homeworks.homework1;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 5.");
        int result = scanner.nextInt();
        if (result == 1) {
            greetings();
        } else if (result == 2) {
            int a, b, c;
            a = (int)(Math.random() *100);
            b = (int)(Math.random() *100);
            c = (int)(Math.random() *100);
            checkSign(a, b, c);
        } else if (result == 3) {
            selectColor();
        } else if (result == 4) {
            compareNumbers();
        } else if (result == 5) {
            int a, b;
            boolean c;
            a = (int)(Math.random() *100);
            b = (int)(Math.random() *100);
            c = true;
            addOrSubtractAndPrint(a, b, c);
        }
    }

    public static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }

    public static void checkSign(int a, int b, int c) {
        if (a + b + c > 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColor() {
        int data = (int)(Math.random() *100);
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data > 10 && data <=20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 4, b = 7;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }
    }

}

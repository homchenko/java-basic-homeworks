package ru.homchenko.java.basic.homeworks.homework17javaio2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название файла: ");
        String fileName = scanner.next();
        System.out.println("Введите искомую последовательность символов: ");
        String subStr = scanner.next();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            String text = "";
            while ((line = bufferedReader.readLine()) != null) {
                text += line;
            }
            System.out.println("Введенная последовательность символов найдена " + countCharsSequence(text, subStr) + " раз");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int countCharsSequence(String string, String subString) {
        int count = 0;
        int idx = string.indexOf(subString);
        while (idx != -1) {
            count++;
            idx = string.indexOf(subString, idx + 1);
        }
        return count;
    }
}
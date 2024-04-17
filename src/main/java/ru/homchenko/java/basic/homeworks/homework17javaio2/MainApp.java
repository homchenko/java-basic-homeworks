package ru.homchenko.java.basic.homeworks.homework17javaio2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
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
            String text = null;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                text = text == null ? line : text + " " + line;
            }
            System.out.println(text);
            System.out.println(countCharsSequence(text, subStr));

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
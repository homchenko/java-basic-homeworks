package ru.homchenko.java.basic.homeworks.homework13javaio;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        // Класс File - абстрактное представление пути к файлу или директории.
        // Создание экземпляра класса не приводит к загрузке файла или директории в памāтþ.
        File directory = new File(System.getProperty("user.dir"));

        if (directory.isDirectory()) {
            File[] files = directory.listFiles();

            if (files != null) {
                System.out.println("Вам доступны следующие файлы: ");
                for (File file : files) {
                    if (file.isFile() && file.getName().endsWith(".txt"))
                        System.out.println(file.getName());
                }
            }

            System.out.println("Введите название файла: ");
            Scanner scanner = new Scanner(System.in);
            String fileName = scanner.next(); // после считывания оставляет \n
            scanner.nextLine(); // фиксит \n

            try (FileInputStream fis = new FileInputStream(fileName);
                 BufferedInputStream bis = new BufferedInputStream(fis);
                 InputStreamReader isr = new InputStreamReader(bis); //для чтения с учетом кодировки
            ) {
                int n = isr.read();
                while (n != -1) {
                    System.out.print((char) n);
                    n = isr.read();
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }

            System.out.println("\nВведите текст для записи в файл: ");
            String text = scanner.nextLine();

            // Для того чтобы записать текст в конец существующего файла,
            // необходимо использовать конструктор FileOutputStream(fileName, true)
            // для открытия файла в режиме добавления (append mode).
            // Таким образом, новый текст будет добавлен в конец файла, а не перезаписан.
            try (FileOutputStream fos = new FileOutputStream(fileName, true);
                 BufferedOutputStream bos = new BufferedOutputStream(fos);
            ) {
                byte[] buffer = text.getBytes(StandardCharsets.UTF_8);
                for (int i = 0; i < buffer.length; i++) {
                    bos.write(buffer[i]);
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }
}


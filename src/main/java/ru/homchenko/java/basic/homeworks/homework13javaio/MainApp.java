package ru.homchenko.java.basic.homeworks.homework13javaio;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        File directory = new File(".");

        if (checkDirectory(directory)) {
            System.out.println("Введите название файла: ");
            Scanner scanner = new Scanner(System.in);
            String fileName = scanner.next();
            scanner.nextLine();
            readFile(fileName);

            System.out.println("\nВведите текст для записи в файл: ");
            String text = scanner.nextLine();
            writeFile(fileName, text);
        }
    }

    private static void writeFile(String fileName, String text) {
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

    private static void readFile(String fileName) {
        try (FileInputStream fis = new FileInputStream(fileName);
             BufferedInputStream bis = new BufferedInputStream(fis);
             InputStreamReader isr = new InputStreamReader(bis);
        ) {
            int n = isr.read();
            while (n != -1) {
                System.out.print((char) n);
                n = isr.read();
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    private static boolean checkDirectory(File directory) {
        boolean ret = false;

        if (directory.isDirectory()) {
            File[] files = directory.listFiles();

            if (files != null) {
                System.out.println("Вам доступны следующие файлы: ");
                for (File file : files) {
                    if (file.isFile() && file.getName().endsWith(".txt")) {
                        ret = true;
                        System.out.println(file.getName());
                    }
                }
            }
        }
        return ret;
    }
}

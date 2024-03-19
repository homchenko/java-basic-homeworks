package ru.homchenko.java.basic.homeworks.homework14network;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try (Socket socket = new Socket("localhost", 8080)) {
                ExampleClient exampleClient = new ExampleClient(socket.getInputStream(), socket.getOutputStream());

                System.out.println("Доступные операции: +, -, /, *\nВведите первый операнд: ");
                int firstOp = scanner.nextInt();
                System.out.println("Введите оператор: ");
                String operator = scanner.next();
                System.out.println("Введите второй операнд: ");
                int secondOp = scanner.nextInt();

                exampleClient.send(firstOp, operator, secondOp);

                break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

package ru.homchenko.java.basic.homeworks.homework14network;

import java.io.*;
import java.net.Socket;

public class ClientHandler {
    private final Socket clientSocket;
    private final DataInputStream dataInputStream;
    private final DataOutputStream dataOutputStream;

    private int clientFirstOperand;
    private int clientSecondOperator;
    private char clientOperator;

    public ClientHandler(Socket clientSocket) throws IOException {
        this.clientSocket = clientSocket;
        this.dataInputStream = new DataInputStream(clientSocket.getInputStream());
        this.dataOutputStream = new DataOutputStream(clientSocket.getOutputStream());
    }

    public void availableOperations () throws IOException {
        dataOutputStream.writeUTF("Доступные операции: +, -, /, *");
        dataOutputStream.flush();
    }
    public void requestData() throws IOException {
        clientFirstOperand = dataInputStream.readInt();
        clientOperator = dataInputStream.readChar();
        clientSecondOperator = dataInputStream.readInt();
    }

    public int calculate() {
        if (clientFirstOperand != 0 && clientSecondOperator != 0) {
            switch (clientOperator) {
                case '+':
                    return clientFirstOperand + clientSecondOperator;
                case '-':
                    return clientFirstOperand - clientSecondOperator;
                case '/':
                    return clientFirstOperand / clientSecondOperator;
                case '*':
                    return clientFirstOperand * clientSecondOperator;
            }
        }

        return 0;
    }

    public void getResult() throws IOException {
        int result = this.calculate();
        dataOutputStream.writeUTF("Результат: " + clientFirstOperand +
                " " + clientOperator + " " + clientSecondOperator +
                " = " + result);
        dataOutputStream.flush();
    }
}

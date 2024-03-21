package ru.homchenko.java.basic.homeworks.homework14network;

import java.io.*;

public class ExampleClient {
    private final DataInputStream dataInputStream;
    private final DataOutputStream dataOutputStream;

    public ExampleClient(InputStream dataInputStream, OutputStream dataOutputStream) {
        this.dataInputStream = new DataInputStream(dataInputStream);
        this.dataOutputStream = new DataOutputStream(dataOutputStream);
    }

    public void send (int firstOp, String oper, int secondOp) throws IOException {
        dataOutputStream.writeInt(firstOp);
        dataOutputStream.writeChar(oper.charAt(0));
        dataOutputStream.writeInt(secondOp);
        dataOutputStream.flush();
    }

    public void get () throws IOException {
        String result = dataInputStream.readUTF();
        System.out.println(result);
    }
}

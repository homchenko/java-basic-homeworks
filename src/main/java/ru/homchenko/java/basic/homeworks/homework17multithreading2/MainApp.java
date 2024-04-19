package ru.homchenko.java.basic.homeworks.homework17multithreading2;

public class MainApp {
    private class ABCWriter {
        private char ch;
        public void writeA(int i) {
            ch = 'A';
            System.out.println(i + ") Print: " + ch);
        }

        public void writeB(int i) {
            ch = 'B';
            System.out.println(i + ") Print: " + ch);
        }

        public void writeC(int i) {
            ch = 'C';
            System.out.println(i + ") Print: " + ch);
        }
    }

    private final Object monitor = new Object();
    private ABCWriter writer = new ABCWriter();
    private int threadOrder = 1;

    public static void main(String[] args) {
        MainApp mainAppObject = new MainApp();
        new Thread(() -> {
            mainAppObject.toA();
        }).start();
        new Thread(() -> {
            mainAppObject.toB();
        }).start();
        new Thread(() -> {
            mainAppObject.toC();
        }).start();
    }

    public void toA () {
        synchronized (monitor) {
            try {
                for (int i = 1; i <=5; i++) {
                    while (threadOrder != 1) {
                        monitor.wait();
                    }
                    writer.writeA(i);
                    threadOrder = 2;
                    monitor.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void toB () {
        synchronized (monitor) {
            try {
                for (int i = 1; i <= 5; i++) {
                    while (threadOrder != 2) {
                        monitor.wait();
                    }
                    writer.writeB(i);
                    threadOrder = 3;
                    monitor.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void toC () {
        synchronized (monitor) {
            try {
                for (int i = 1; i <= 5; i++) {
                    while (threadOrder != 3) {
                        monitor.wait();
                    }
                    writer.writeC(i);
                    threadOrder = 1;
                    monitor.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

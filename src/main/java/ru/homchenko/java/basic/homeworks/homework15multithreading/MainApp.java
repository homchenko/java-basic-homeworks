package ru.homchenko.java.basic.homeworks.homework15multithreading;

public class MainApp {
    public static void main(String[] args) {
        int l = 100_000_000;
        long time1 = System.currentTimeMillis();
        createArr(0, l);
        long time2 = System.currentTimeMillis();
        System.out.println("Время выполнения 1: " + (time2 - time1));

        long time3 = System.currentTimeMillis();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                createArr(0, 25_000_000);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                createArr(25_000_000, 50_000_000);
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                createArr(50_000_000, 75_000_000);
            }
        });

        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                createArr(75_000_000, 100_000_000);
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        long time4 = System.currentTimeMillis();
        System.out.println("Время выполнения 2: " + (time4 - time3));
    }

    public static void createArr(int n, int length) {
        double array[] = new double[length];
        for (int i = n; i < array.length; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
    }
}

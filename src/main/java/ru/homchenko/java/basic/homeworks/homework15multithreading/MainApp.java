package ru.homchenko.java.basic.homeworks.homework15multithreading;

public class MainApp {
    public static void main(String[] args) throws InterruptedException {
        int l = 100_000_000;
        double[] array2 = new double[l];

        long time1 = System.currentTimeMillis();
        createAndFillArr(0, l);
        long time2 = System.currentTimeMillis();
        System.out.println("Время выполнения 1: " + (time2 - time1));

        long time3 = System.currentTimeMillis();
        Thread t1 = new Thread(() -> {
            fillArr(0, 25_000_000, array2);
            System.out.println("t1 finished");
        });
        Thread t2 = new Thread(() -> {
            fillArr(25_000_000, 50_000_000, array2);
            System.out.println("t2 finished");
        });
        Thread t3 = new Thread(() -> {
            fillArr(50_000_000, 75_000_000, array2);
            System.out.println("t3 finished");
        });
        Thread t4 = new Thread(() -> {
            fillArr(75_000_000, 100_000_000, array2);
            System.out.println("t4 finished");
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();

        long time4 = System.currentTimeMillis();
        System.out.println("Время выполнения 2: " + (time4 - time3));
    }

    public static void createAndFillArr(int n, int l) {
        double[] array = new double[l];
        for (int i = n; i < array.length; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
    }

    public static void fillArr(int n, int l, double[] array) {
        for (int i = n; i < l; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
    }
}

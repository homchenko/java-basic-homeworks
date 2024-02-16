package ru.homchenko.java.basic.homeworks.homework5;

public class MainApp {
    public static void main(String[] args) {
        int time;
        Cat cat = new Cat("Tom", 4, 2);
        Dog dog = new Dog("Bars", 20, 4, 2);
        Horse horse = new Horse("Astra", 30, 10, 5);

        cat.printInfo();
        time = cat.run(4);
        System.out.println("Время: " + time);
        cat.swim(20);
        cat.printInfo();
        time = cat.run(4);
        System.out.println("Время: " + time);
        dog.printInfo();
        time = dog.swim(10);
        System.out.println("Время: " + time);
        dog.printInfo();
    }
}

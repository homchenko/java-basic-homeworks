package ru.homchenko.java.basic.homeworks.homework5;

public class Cat extends Animal {
    public Cat(String name, int stayingPower, int runningSpeed) {
        super(name, stayingPower, runningSpeed);
    }

    @Override
    public int swim(int distance) {
        System.out.println(name + " не умеет плавать");
        return 0;
    }
}

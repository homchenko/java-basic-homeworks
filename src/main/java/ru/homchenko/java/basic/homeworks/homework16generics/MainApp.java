package ru.homchenko.java.basic.homeworks.homework16generics;

public class MainApp {
    public static void main(String[] args) {
        Box boxOranges = new Box();
        boxOranges.addFruit(new Orange());
        System.out.println(boxOranges.getWeight());

        Box boxApples = new Box();
        boxApples.addFruit(new Apple());
        boxApples.addFruit(new Apple());
        System.out.println(boxApples.getWeight());

        System.out.println(boxApples.compare(boxOranges));

        boxApples.transferFruitsTo(boxOranges);
        System.out.println(boxApples.getWeight());
        System.out.println(boxOranges.getWeight());
    }
}

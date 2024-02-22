package ru.homchenko.java.basic.homeworks.homework6;

public class MainApp {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik", 5),
                new Cat("Tom", 5),
                new Cat("Belka", 11)
        };
        Plate plate = new Plate(20);

        for (int i = 0; i < cats.length; i++) {
            plate.reduceFood(cats[i]);
            plate.printInfo();
            cats[i].printInfo();
        }

        plate.addFood(10);
        plate.printInfo();
    }
}

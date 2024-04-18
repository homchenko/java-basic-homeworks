package ru.homchenko.java.basic.homeworks.homework16generics;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruitList;

    public Box() {
        this.fruitList = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        fruitList.add(fruit);
    }

    public double getWeight() {
        if (fruitList.isEmpty()) {
            return 0.0;
        }

        double weight = 0.0;
        for (T fruit : fruitList) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean compare(Box<? extends Fruit> otherBox) {
        return Math.abs(this.getWeight() - otherBox.getWeight()) < 0.0001;
    }

    //Чтобы можно было перекидывать фрукты в коробку с "родительскими" фруктами, можно заменить аргумент на:
    //public void transferFruitsTo(Box<? super T> otherBox)
    public void transferFruitsTo(Box<T> otherBox) {
        if (this == otherBox) {
            return;
        }

        for (T fruit : fruitList) {
            otherBox.addFruit(fruit);
        }

        fruitList.clear();
    }
}

package ru.homchenko.java.basic.homeworks.homework6;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public int getAppetite() {
        return appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }
    public void printInfo() {
        String isSatiety;
        if (this.isSatiety()) {
            isSatiety = "Да";
        } else {
            isSatiety = "Нет";
        }
        System.out.println("Кот: " + this.name + " ; сыт: " + isSatiety);
    }
}

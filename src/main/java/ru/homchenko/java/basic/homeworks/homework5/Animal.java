package ru.homchenko.java.basic.homeworks.homework5;

public abstract class Animal {
    protected String name;
    protected int runningSpeed;
    protected int swimmingSpeed;
    protected int stayingPower;

    //Абстрактные классы не должны иметь общедоступных конструкторов. Достаточно модификатора protected!!!
    protected Animal(String name, int stayingPower, int runningSpeed) {
        this.name = name;
        this.stayingPower = stayingPower;
        this.runningSpeed = runningSpeed;
    }

    public int run(int distance) {
        int time;
        stayingPower = stayingPower - distance;
        if (stayingPower < 1) {
            time = -1;
            System.out.println(name + " - появилась усталось. Нужно отдохнуть.");
        } else {
            time = distance / runningSpeed;
        }
        return time;
    }

    public void printInfo() {
        System.out.println("Имя: " + name + ";" + "\nвыносливость: " + stayingPower + ";" + "\nскорость бега: " + runningSpeed + " м/с;");
    }

    public abstract int swim(int distance);
}

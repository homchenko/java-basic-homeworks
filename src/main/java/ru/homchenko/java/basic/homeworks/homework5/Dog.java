package ru.homchenko.java.basic.homeworks.homework5;

public class Dog extends Animal {
    public Dog(String name, int stayingPower, int runningSpeed, int swimmingSpeed) {
        super(name, stayingPower, runningSpeed);
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public int swim(int distance) {
        int time;
        stayingPower = stayingPower - distance * 2;
        if (stayingPower < 1) {
            time = -1;
            System.out.println(name + " - появилась усталось. Нужно отдохнуть.");
        } else {
            time = distance / runningSpeed;
        }
        return time;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("скорость плавания: " + swimmingSpeed + " м/с;");
    }
}

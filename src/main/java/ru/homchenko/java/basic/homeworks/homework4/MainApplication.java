package ru.homchenko.java.basic.homeworks.homework4;

import java.util.Random;

public class MainApplication {
    public static void main(String[] args) {
        User[] users = new User[10];
        Random random = new Random();
        int yearRandom;

        for (int i = 0; i < users.length; i++) {
            yearRandom = random.nextInt(2024 - 1950 + 1) + 1950;
            //System.out.println(yearRandom);
            users[i] = new User("Фамилия_" + i, "Имя_" + i, "Отчество_" + i, yearRandom, "email_" + i);
        }

        for (int i = 0; i < users.length; i++) {
            if (users[i].getAge() > 40)
                users[i].printInfo();
        }

        Box box1 = new Box(2, "green");
        box1.printInfo();
        box1.status();
        box1.setOpen(true);
        box1.setOpen(true);
        box1.putItem("item1");
        box1.putItem("item2");
        box1.putItem("item3");
        box1.throwAwayItem("item1");
        box1.setColor("black");
        box1.printInfo();
        box1.putItem("item3");
        box1.printInfo();
    }
}

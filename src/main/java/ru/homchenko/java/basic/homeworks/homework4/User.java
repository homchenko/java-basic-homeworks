package ru.homchenko.java.basic.homeworks.homework4;

public class User {
    private String secondName;
    private String name;
    private String surName;
    private int yearOfBirth;
    private String email;

    public int getAge() {
        return 2024 - yearOfBirth;
    }

    public User(String secondName, String name, String surName, int yearOfBirth, String email) {
        this.secondName = secondName;
        this.name = name;
        this.surName = surName;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
    }

    public void printInfo(){
        System.out.println("ФИО: " + secondName + " " + name + " " + surName
                + "\nГод рождения: " + yearOfBirth
                + "\ne-mail: " + email + "\n");
    }
}

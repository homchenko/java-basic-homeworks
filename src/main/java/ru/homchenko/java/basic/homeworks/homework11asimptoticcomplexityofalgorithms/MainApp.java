package ru.homchenko.java.basic.homeworks.homework11asimptoticcomplexityofalgorithms;

public class MainApp {
    public static void main(String[] args) {
        // асимптотическая сложность методов класса PersonDataBase д.б. О(1)
        PersonDataBase personDataBase = new PersonDataBase();
        personDataBase.add(new Person("Name1", Position.DEVELOPER, 10000L));
        personDataBase.add(new Person("Name2", Position.DRIVER, 10001L));
        personDataBase.add(new Person("Name3", Position.BRANCH_DIRECTOR, 10002L));
        personDataBase.add(new Person("Name4", Position.DIRECTOR, 10003L));
        personDataBase.add(new Person("Name5", Position.ENGINEER, 10004L));

        System.out.println(personDataBase.isManager(personDataBase.findById(10000L)));
        personDataBase.findById(10000L).printInfo();
        System.out.println(personDataBase.isManager(personDataBase.findById(10001L)));
        personDataBase.findById(10001L).printInfo();
        System.out.println(personDataBase.isEmployee(10001L));
        System.out.println(personDataBase.isEmployee(10002L));
        System.out.println(personDataBase.isEmployee(10003L));
        System.out.println(personDataBase.isEmployee(10004L));
    }
}

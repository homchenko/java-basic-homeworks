package ru.homchenko.java.basic.homeworks.homework11asimptoticcomplexityofalgorithms;

public class Person {
    private String name;
    private Position position;
    private Long id;

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public Long getId() {
        return id;
    }

    public Person(String name, Position position, Long id) {
        this.name = name;
        this.position = position;
        this.id = id;
    }

    public void printInfo() {
        System.out.println("Name: " + this.name + " Pos: " + this.getPosition() + " id: " + this.getId());
    }
}

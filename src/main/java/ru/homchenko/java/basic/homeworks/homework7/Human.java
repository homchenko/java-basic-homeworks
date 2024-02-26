package ru.homchenko.java.basic.homeworks.homework7;

public class Human {
    private String name;
    private int energy;
    private Transport currentTransport;

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public Transport getCurrentTransport() {
        return currentTransport;
    }

    public void setCurrentTransport(Transport currentTransport) {
        this.currentTransport = currentTransport;
    }

    public Human(String name) {
        this.name = name;
        energy = 10;
    }

    public void getOffTransport() {
        System.out.println("Вы без транспорта.");
        this.currentTransport = null;
    }

    public void walk(int distance, TerrainType terrainType) {
        if (energy > energy - (int) (distance * 0.5f)) {
            energy = energy - (int) (distance * 0.5f);
            System.out.println("Транспорт не выбран. Иду пешком по: " + terrainType);
        }
    }

    public void wantToMove(int distance, TerrainType terrainType) {
        if (this.getCurrentTransport() != null) {
            this.getCurrentTransport().move(distance, terrainType);
        } else {
            this.walk(distance, terrainType);
        }
    }

    public void printInfo() {
        String transportName;
        if (currentTransport != null) {
            transportName = currentTransport.getNameTransport();
        } else {
            transportName = "не выбран";
        }
        System.out.println("Имя: " + this.name + " Энергия: " + this.energy + " Транспорт: " + transportName);
    }
}

package ru.homchenko.java.basic.homeworks.homework7;

public class Bicycle implements Transport {
    protected String name;
    protected TerrainType restrictionOfMovement;

    public Bicycle() {
        this.restrictionOfMovement = TerrainType.SWAMP;
        this.name = "Bicycle";
    }

    @Override
    public boolean move(int distance, TerrainType terrainType) {
        if (!this.restrictionOfMovement.equals(terrainType)) {
            System.out.println("Поехали");
            return true;
        } else {
            System.out.println("Смените вид транспорта");
            return false;
        }
    }

    @Override
    public String getNameTransport() {
        return this.name;
    }

    @Override
    public void printInfo() {
        System.out.println("Не расходую ничего");
    }
}

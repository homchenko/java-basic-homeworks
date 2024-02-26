package ru.homchenko.java.basic.homeworks.homework7;

public class Horse implements Transport {
    private int energy;
    protected TerrainType restrictionOfMovement;
    protected String name;

    public Horse() {
        energy = 50;
        restrictionOfMovement = TerrainType.SWAMP;
        name = "Horse";
    }

    @Override
    public boolean move(int distance, TerrainType terrainType) {
        if (!this.restrictionOfMovement.equals(terrainType) && energy > (int) (distance * 0.5f)) {
            energy = energy - (int) (distance * 0.5f);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getNameTransport() {
        return this.name;
    }
    @Override
    public void printInfo() {
        System.out.println("Осталось энергии: " + this.energy);
    }
}

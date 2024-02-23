package ru.homchenko.java.basic.homeworks.homework7;

public class AllTerrainVehicle implements Transport {
    private int benzine;
    protected String name;

    public AllTerrainVehicle() {
        benzine = 50;
        name = "AllTerrainVehicle";
    }

    @Override
    public boolean move(int distance, TerrainType terrainType) {
        if (benzine > benzine - (int) (distance * 0.2f)) {
            System.out.println("Поехали");
            benzine = benzine - (int) (distance * 0.2f);
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
        System.out.println("Осталось бензина: " + this.benzine);
    }
}

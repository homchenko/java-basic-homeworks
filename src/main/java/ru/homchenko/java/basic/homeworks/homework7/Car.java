package ru.homchenko.java.basic.homeworks.homework7;

public class Car implements Transport {
    private int benzine;
    protected TerrainType[] restrictionOfMovement;
    protected String name;

    public Car() {
        benzine = 50;
        restrictionOfMovement = new TerrainType[]{TerrainType.DENSE_FOREST, TerrainType.SWAMP};
        name = "Car";
    }

    @Override
    public boolean move(int distance, TerrainType terrainType) {
        for (int i = 0; i < restrictionOfMovement.length; i++) {
            if (!restrictionOfMovement[i].equals(terrainType) && benzine > benzine - (int) (distance * 0.1f)) {
                benzine = benzine - (int) (distance * 0.1f);
                return true;
            }
        }
        System.out.println(this.getNameTransport() + " не может перемещаться по " + terrainType);
        return false;
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

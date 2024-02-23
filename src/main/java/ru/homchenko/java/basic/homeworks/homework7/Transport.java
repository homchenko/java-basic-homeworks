package ru.homchenko.java.basic.homeworks.homework7;

public interface Transport {
    //возможность перемещаться на определенное расстояние с указанием типа местности
    public boolean move(int distance, TerrainType terrainType);

    public String getNameTransport();

    public void printInfo();
}

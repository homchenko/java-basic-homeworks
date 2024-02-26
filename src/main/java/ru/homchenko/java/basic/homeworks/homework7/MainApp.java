package ru.homchenko.java.basic.homeworks.homework7;

public class MainApp {
    public static void main(String[] args) {
        AllTerrainVehicle allTerrainVehicle = new AllTerrainVehicle();
        Bicycle bicycle = new Bicycle();
        Car car = new Car();
        Horse horse = new Horse();

        Human human = new Human("Oleg");
        human.setCurrentTransport(allTerrainVehicle);
        human.printInfo();
        allTerrainVehicle.printInfo();
        human.wantToMove(10, TerrainType.PLAIN);
        allTerrainVehicle.printInfo();

        human.getOffTransport();
        human.printInfo();
        human.wantToMove(10, TerrainType.DENSE_FOREST);
        human.printInfo();

        human.setCurrentTransport(car);
        human.wantToMove(10, TerrainType.SWAMP);
        human.printInfo();
        car.printInfo();

        human.setCurrentTransport(bicycle);
        human.wantToMove(10, TerrainType.DENSE_FOREST);
        human.printInfo();

        human.setCurrentTransport(horse);
        human.wantToMove(15, TerrainType.PLAIN);
        human.printInfo();
        horse.printInfo();
    }
}

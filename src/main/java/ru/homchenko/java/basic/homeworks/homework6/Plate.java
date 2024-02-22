package ru.homchenko.java.basic.homeworks.homework6;

public class Plate {
    private int amountOfFoodMax;
    private int amountOfFoodCurrent;

    public int getAmountOfFoodCurrent() {
        return amountOfFoodCurrent;
    }

    public void setAmountOfFoodCurrent(int amountOfFoodCurrent) {
        this.amountOfFoodCurrent = amountOfFoodCurrent;
    }

    public int getAmountOfFoodMax() {
        return amountOfFoodMax;
    }

    public Plate(int amountOfFoodMax) {
        this.amountOfFoodMax = amountOfFoodMax;
        this.amountOfFoodCurrent = amountOfFoodMax;
    }

    public void addFood(int amountOfFood) {
        int sum;
        sum = this.getAmountOfFoodCurrent() + amountOfFood;
        if (sum <= this.getAmountOfFoodMax()) {
            this.setAmountOfFoodCurrent(sum);
        } else {
            this.setAmountOfFoodCurrent(this.getAmountOfFoodMax());
        }
    }

    public boolean reduceFood(Cat cat) {
        int difference;
        difference = this.getAmountOfFoodCurrent() - cat.getAppetite();
        if (difference >= 0) {
            this.setAmountOfFoodCurrent(difference);
            cat.setSatiety(true);
            return true;
        } else {
            System.out.println("В тарелке мало еды");
            return false;
        }
    }

    public void printInfo() {
        System.out.println("Количество еды в тарелке: " + this.getAmountOfFoodCurrent());
    }
}

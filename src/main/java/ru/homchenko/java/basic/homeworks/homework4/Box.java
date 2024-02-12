package ru.homchenko.java.basic.homeworks.homework4;

import java.util.Arrays;

public class Box {
    int size;
    String color;
    String[] items;
    boolean isOpen;

    public Box(int size, String color) {
        this.size = size;
        this.color = color;
        this.items = new String[size];
        this.isOpen = false;
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println("Вы изменили цвет коробки на: " + color);
    }

    public void printInfo() {
        System.out.println("Размер: " + this.size
                + "\nЦвет: " + this.color
                + "\nСостояние: " + this.status() + "\n"
                + Arrays.toString(items));
    }

    public String status() {
        if (this.isOpen == true)
            return "Коробка открыта";
        else
            return "Коробка закрыта";
    }

    public void setOpen(boolean open) {
        if (this.isOpen == true && open == true)
            System.out.println("Коробка уже открыта");
        else if (this.isOpen == false && open == false)
            System.out.println("Коробка уже закрыта");
        else if (this.isOpen == true && open == false) {
            isOpen = open;
            System.out.println("Вы закрыли коробку");
        } else {
            isOpen = open;
            System.out.println("Вы открыли коробку");
        }
    }

    public void putItem(String item) {
        if (this.isOpen == false) {
            System.out.println("Откройте сначала коробку");
            return;
        }
        int countItems = 0;
        for (int i = 0; i < size; i++) {
            if (items[i] == null) {
                items[i] = item;
                System.out.println("В коробку помещен предмет: " + item);
                return;
            } else {
                countItems++;
            }
        }
        if (countItems == size)
            System.out.println("В коробке нет места. Извлеките какой-нибудь предмет");
    }

    public void throwAwayItem(String item) {
        if (this.isOpen == false) {
            System.out.println("Откройте сначала коробку");
            return;
        }
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals(item)) {
                items[i] = null;
                System.out.println("Вы извлекли " + item);
                return;
            } else {
                System.out.println("Такого предмета нет в коробке");
            }
        }
    }
}

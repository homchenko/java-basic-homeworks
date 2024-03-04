package ru.homchenko.java.basic.homeworks.homework10collectionsframework;

public class MainApp {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("+375331112233", "name1");
        phoneBook.add("+375331112244", "name2");
        phoneBook.add("+375331112255", "name3");
        phoneBook.add("+375331112266", "name4");
        phoneBook.add("+375331112277", "name4");

        phoneBook.printInfo();

        System.out.println(phoneBook.findNumber("name1"));
        System.out.println(phoneBook.findNumber("name4"));
        System.out.println(phoneBook.containsPhoneNumber("+375331112233"));
        System.out.println(phoneBook.containsPhoneNumber("+375331110000"));
    }
}

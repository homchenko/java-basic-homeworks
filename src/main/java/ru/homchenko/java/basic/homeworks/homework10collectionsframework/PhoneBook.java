package ru.homchenko.java.basic.homeworks.homework10collectionsframework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private Map<String, String> recordsMap;

    public PhoneBook() {
        this.recordsMap = new HashMap<>();
    }

    public void add(String key, String value) {
        this.recordsMap.put(key, value);
    }

    public Set findNumber(String name) {
        Set numbers = new HashSet<>();
        for (Map.Entry<String, String> entry : this.recordsMap.entrySet()) {
            if (entry.getValue().equals(name))
                numbers.add(entry.getKey());
        }
        return numbers;
    }

    public boolean containsPhoneNumber(String number) {
        return recordsMap.containsKey(number);
    }

    public void printInfo() {
        for (Map.Entry<String, String> entry : this.recordsMap.entrySet()) {
            System.out.println("Number: " + entry.getKey() + " - Name: " + entry.getValue());
        }
    }
}


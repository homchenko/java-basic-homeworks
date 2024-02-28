package ru.homchenko.java.basic.homeworks.homework9;

import java.util.ArrayList;
import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>(Arrays.asList(2, 4, 3, 7, 8, 10));
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            employeeArrayList.add(new Employee("Name" + i, 30 + i));
        }
        System.out.println(employeeArrayList);

        System.out.println(fillArrayList(5, 10));
        System.out.println(sumListsElements(integerArrayList));
        System.out.println(rewriteArrayList(integerArrayList, 5));
        System.out.println(increaseElementsOfArrList(integerArrayList, 33));
        System.out.println(getNames(employeeArrayList));
        System.out.println(getYounger(employeeArrayList, 33));
        System.out.println(checkAverageAge(employeeArrayList, 30));
        System.out.println(findYoungerEmployee(employeeArrayList));
    }

    public static ArrayList fillArrayList(int min, int max) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            integerArrayList.add(i);
        }
        return integerArrayList;
    }

    public static int sumListsElements(ArrayList<Integer> integerArrayList) {
        int num = 5;
        int sum = 0;
        for (int i = 0; i < integerArrayList.size(); i++) {
            if (integerArrayList.get(i) > num) {
                sum += integerArrayList.get(i);
            }
        }
        return sum;
    }

    public static ArrayList<Integer> rewriteArrayList(ArrayList<Integer> integerArrayList, int num) {
        for (int i = 0; i < integerArrayList.size(); i++) {
            integerArrayList.set(i, num);
        }
        return integerArrayList;
    }

    public static ArrayList<Integer> increaseElementsOfArrList(ArrayList<Integer> integerArrayList, int num) {
        for (int i = 0; i < integerArrayList.size(); i++) {
            integerArrayList.set(i, integerArrayList.get(i) + num);
        }
        return integerArrayList;
    }

    public static ArrayList<String> getNames(ArrayList<Employee> employeeArrayList) {
        ArrayList<String> namesArrayList = new ArrayList<>();
        for (Employee employee : employeeArrayList) {
            namesArrayList.add(employee.getName());
        }
        return namesArrayList;
    }

    public static ArrayList<String> getYounger(ArrayList<Employee> employeeArrayList, int minAge) {
        ArrayList<String> namesArrayList = new ArrayList<>();
        for (Employee employee : employeeArrayList) {
            if (employee.getAge() >= minAge)
                namesArrayList.add(employee.getName());
        }
        return namesArrayList;
    }

    public static boolean checkAverageAge(ArrayList<Employee> employeeArrayList, int minAverageAge) {
        int average = 0;
        for (Employee employee : employeeArrayList) {
            average += employee.getAge();
        }
        return average / employeeArrayList.size() > minAverageAge;
    }

    public static Employee findYoungerEmployee(ArrayList<Employee> employeeArrayList) {
        Employee youngerEmployee = employeeArrayList.get(0);
        for (int i = 1; i < employeeArrayList.size(); i++) {
            if (employeeArrayList.get(i).getAge() < youngerEmployee.getAge())
                youngerEmployee = employeeArrayList.get(i);
        }
        return youngerEmployee;
    }
}

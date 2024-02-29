package ru.homchenko.java.basic.homeworks.homework9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    public static List<Integer> fillArrayList(int min, int max) {
        List<Integer> integerArrayList = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            integerArrayList.add(i);
        }
        return integerArrayList;
    }

    public static int sumListsElements(List<Integer> integerArrayList) {
        int num = 5;
        int sum = 0;
        for (Integer i : integerArrayList) {
            if (i > num)
                sum += i;
        }
        return sum;
    }

    public static List<Integer> rewriteArrayList(List<Integer> integerArrayList, int num) {
        for (int i = 0; i < integerArrayList.size(); i++) {
            integerArrayList.set(i, num);
        }
        return integerArrayList;
    }

    public static List<Integer> increaseElementsOfArrList(List<Integer> integerArrayList, int num) {
        for (int i = 0; i < integerArrayList.size(); i++) {
            integerArrayList.set(i, integerArrayList.get(i) + num);
        }
        return integerArrayList;
    }

    public static List<String> getNames(List<Employee> employeeArrayList) {
        List<String> namesArrayList = new ArrayList<>();
        for (Employee employee : employeeArrayList) {
            namesArrayList.add(employee.getName());
        }
        return namesArrayList;
    }

    public static List<String> getYounger(List<Employee> employeeArrayList, int minAge) {
        List<String> namesArrayList = new ArrayList<>();
        for (Employee employee : employeeArrayList) {
            if (employee.getAge() >= minAge)
                namesArrayList.add(employee.getName());
        }
        return namesArrayList;
    }

    public static boolean checkAverageAge(List<Employee> employeeArrayList, int minAverageAge) {
        int average = 0;
        for (Employee employee : employeeArrayList) {
            average += employee.getAge();
        }
        return average / employeeArrayList.size() > minAverageAge;
    }

    public static Employee findYoungerEmployee(List<Employee> employeeArrayList) {
        Employee youngerEmployee = employeeArrayList.get(0);
        for (Employee employee : employeeArrayList) {
            if (employee.getAge() < youngerEmployee.getAge())
                youngerEmployee = employee;
        }
        return youngerEmployee;
    }
}

package ru.homchenko.java.basic.homeworks.homework2;

import java.util.Arrays;

public class MainApplication {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        int[] arr2 = {2, 6, 6, 1};

        printStr(2, "string");
        printSumElements(2, 4, 7, 7);
        fillArr(4, arr);
        increaseNum(5, arr);
        compareSum(arr2);
    }

    public static void printStr(Integer i, String s) {
        for (int j = 0; j < i; j++) {
            System.out.println(s);
        }
    }

    public static void printSumElements(int... arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }

    public static void fillArr(int i, int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            arr[j] = i;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void increaseNum(int i, int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            arr[j] += i;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void compareSum(int[] arr) {
        int sumLeft = 0;
        int sumRigth = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            sumLeft += arr[i];
        }
        for (int i = arr.length / 2; i < arr.length; i++) {
            sumRigth += arr[i];
        }
        if (sumLeft > sumRigth) {
            System.out.println("Больше сумма элементов левой половины");
        } else if (sumLeft < sumRigth) {
            System.out.println("Больше сумма элементов правой половины");
        } else {
            System.out.println("Суммы обеих половин массива равны");
        }
    }
}

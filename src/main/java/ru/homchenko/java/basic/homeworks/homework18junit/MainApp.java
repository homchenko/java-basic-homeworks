package ru.homchenko.java.basic.homeworks.homework18junit;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        int[] arr1 = {2, 2, 1, 1, 2, 2};
        System.out.println(containsOneAndTwoOnly(arr1));
        int[] resultArr1 = elemAfterLastOne(arr1);
        for (int i : resultArr1) {
            System.out.println(i);
        }

        int[] arr2 = {2, 2, 2, 2};
        System.out.println(containsOneAndTwoOnly(arr2));
        int[] resultArr2 = elemAfterLastOne(arr2);
    }

    /*public static int[] elemAfterLastOne(int [] arr) {
        boolean foundOne = false;
        int oneIdx = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] ==1) {
                oneIdx = i;
                foundOne = true;
            }
        }
        if (!foundOne) {
            throw  new RuntimeException("В массиве нет единиц.");
        }
        int[] resultArr = new int[arr.length - oneIdx - 1];
        oneIdx++;
        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] = arr[oneIdx];
            oneIdx++;
        }
        return resultArr;
    }*/
    public static int[] elemAfterLastOne(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 1) {
                return Arrays.copyOfRange(arr, i + 1, arr.length);
            }
        }
        throw new RuntimeException("В массиве нет единиц.");
    }
    public static boolean containsOneAndTwoOnly(int[] arr) {
        boolean containsOne = false;
        boolean containsTwo = false;
        for (int i : arr) {
            if(i !=1 && i != 2)
                return false;
            if(i == 1)
                containsOne = true;
            else if (i == 2)
                containsTwo = true;
        }
        return containsOne && containsTwo;
    }
}

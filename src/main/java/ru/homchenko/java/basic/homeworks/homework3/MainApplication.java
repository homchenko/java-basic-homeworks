package ru.homchenko.java.basic.homeworks.homework3;

public class MainApplication {
    public static void main(String[] args) {
        int[][] arr = {{1, 0, 3}, {2, 3, 5}};
        int[][] arr1 = {{1, 0, 3, 5, 6}, {2, 3, 5, 6, 7}, {1, 2, 3, 4, 5}, {2, 2, 3, 3, 3}, {2, 2, 3, 3, 3}};
        int[][] arr2 = {{1, 0, 3}};
        int result;

        result = sumOfPositiveElements(arr);
        System.out.println(result);

        printSquare(6);

        fillDiagonal(arr1);

        result = findMax(arr1);
        System.out.println(result);

        result = sumSecondStr(arr);
        System.out.println(result);

        result = sumSecondStr(arr2);
        System.out.println(result);
    }

    public static int sumOfPositiveElements(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 0) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    public static void printSquare(int i) {
        for (int j = 0; j < i; j++) {
            if (j == 0 || j == i - 1) {
                for (int k = 0; k < i; k++) {
                    System.out.print(" * ");
                }
            } else {
                for (int k = 0; k < i; k++) {
                    if (k == 0 || k == i - 1) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void fillDiagonal(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j || i + j == arr.length - 1) {
                    arr[i][j] = 0;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int findMax(int[][] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    public static int sumSecondStr(int[][] arr) {
        int idx = 1;
        int sum = 0;
        if (arr.length > idx && arr[idx] != null) {
            for (int i = 0; i < arr[idx].length; i++) {
                sum += arr[idx][i];
            }
        } else {
            return -1;
        }
        return sum;
    }
}

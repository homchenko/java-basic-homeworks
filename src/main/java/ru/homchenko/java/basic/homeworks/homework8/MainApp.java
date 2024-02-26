package ru.homchenko.java.basic.homeworks.homework8;

public class MainApp {
    public static void main(String[] args) {
        int arrParam1 = 3;
        int arrParam2 = 4;
        String[][] arr1 = new String[arrParam1][arrParam1];
        for (int i = 0; i < arrParam1; i++) {
            for (int j = 0; j < arrParam1; j++) {
                arr1[i][j] = String.valueOf(i + j);
                System.out.print(arr1[i][j] + "; ");
            }
        }
        System.out.println(" ");

        String[][] arr2 = new String[arrParam2][arrParam2];
        for (int i = 0; i < arrParam2; i++) {
            for (int j = 0; j < arrParam2; j++) {
                arr2[i][j] = String.valueOf(i + j);
                System.out.print(arr2[i][j] + "; ");
            }
        }
        System.out.println(" ");
        arr2[1][1] = "aa";

        try {
            System.out.println(sumArrElem(arr1));
            System.out.println(sumArrElem(arr2));
        } catch (AppArraySizeException e) {
            System.err.println(e.getMessage());
        } catch (AppArrayDataException e) {
            System.err.println(e.getMessage());
        }
    }

    public static int sumArrElem(String[][] arr) throws AppArrayDataException, AppArraySizeException {
        int arrLen = 4;
        int result = 0;
        if (arr.length != arrLen || arr[0].length != arrLen)
            throw new AppArraySizeException("Длина масива не корректна");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    result += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException("Не удается преобразовать данные в ячейке [" + i + "][" + j + "]");
                }
            }
        }
        return result;
    }
}

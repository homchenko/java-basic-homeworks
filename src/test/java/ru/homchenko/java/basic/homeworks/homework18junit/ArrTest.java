package ru.homchenko.java.basic.homeworks.homework18junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ArrTest {
    @BeforeEach
    public void printStart() {
        System.out.println("Тестирование началось");
    }
    @Test
    public void testElemAfterLastOne() {
        int[] arr1 = {2, 2, 1, 1, 2, 2};
        int[] arr2 = {2, 2, 2, 2};
        int[] expectedArr1 = {2, 2};

        Assertions.assertArrayEquals(expectedArr1, MainApp.elemAfterLastOne(arr1));
        Assertions.assertThrows(RuntimeException.class, () -> MainApp.elemAfterLastOne(arr2));
    }
    @Test
    public  void testContainsOneAndTwoOnly() {
        int[] arr1 = {1, 2};
        int[] arr2 = {1, 1};
        int[] arr3 = {1, 3};
        int[] arr4 = {1, 2, 2, 1};

        Assertions.assertTrue(MainApp.containsOneAndTwoOnly(arr1));
        Assertions.assertFalse(MainApp.containsOneAndTwoOnly(arr2));
        Assertions.assertFalse(MainApp.containsOneAndTwoOnly(arr3));
        Assertions.assertTrue(MainApp.containsOneAndTwoOnly(arr4));
    }
    /////////////////////////////////////////////////////////////////////////////////////////////
    @ParameterizedTest
    @MethodSource("provideArraysForElemAfterLastOneTest")
    public void testElemAfterLastOne(int[] inputArr, int[] expectedArr) {
        Assertions.assertArrayEquals(expectedArr, MainApp.elemAfterLastOne(inputArr));
    }
    private static Stream<Arguments> provideArraysForElemAfterLastOneTest() {
        return Stream.of(
                Arguments.of(new int[]{2, 2, 1, 1, 2, 2}, new int[]{2, 2}),
                Arguments.of(new int[]{2, 2, 2, 2}, new int[]{}) // Ожидаемый результат - пустой массив -> но Exception
        );
    }

    @ParameterizedTest
    @MethodSource("provideArraysForContainsOneAndTwoOnlyTest")
    public void testContainsOneAndTwoOnly(int[] inputArr, boolean expectedResult) {
        Assertions.assertEquals(expectedResult, MainApp.containsOneAndTwoOnly(inputArr));
    }
    private static Stream<Arguments> provideArraysForContainsOneAndTwoOnlyTest() {
        return Stream.of(
                Arguments.of(new int[]{1, 2}, true),
                Arguments.of(new int[]{1, 1}, false),
                Arguments.of(new int[]{1, 3}, false),
                Arguments.of(new int[]{1, 2, 2, 1}, false)
        );
    }
}

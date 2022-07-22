package ru.masaviktoria.algorythms;

import java.util.Arrays;

public class RecursionSum {
    public static void main(String[] args) {
        int[] array = ArrayForSorting.createIntArray();
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Sum of array numbers: " + recursionSum(array));
    }

    private static int recursionSum(int[] intArray) {
        int sum;
        if (intArray.length == 1){
            sum = intArray[0];
        } else if (intArray.length == 0) {
            sum = 0;
        } else {
            int[] restOfArray = Arrays.copyOfRange(intArray, 1, intArray.length);
            sum = intArray[0] + recursionSum(restOfArray);
        }
        return  sum;
    }
}

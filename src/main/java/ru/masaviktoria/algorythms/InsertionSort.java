package ru.masaviktoria.algorythms;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] array = ArrayForSorting.createIntArray();
        System.out.println("Array: " + Arrays.toString(array));
        insertionSort(array);
        System.out.println("Insertion sorted array: " + Arrays.toString(array));
    }

    private static void insertionSort(int[] array) {
        for (int k = 0; k < array.length; k++) {
            for (int i = 1; i < array.length; i++) {
                int sortedNumber = array[i];
                if (sortedNumber < array[i - 1]) {
                    array[i] = array[i - 1];
                    array[i - 1] = sortedNumber;
                }
            }
        }
    }
}

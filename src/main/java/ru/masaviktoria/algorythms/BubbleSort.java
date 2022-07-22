package ru.masaviktoria.algorythms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = ArrayForSorting.createIntArray();
        System.out.println("Array: " + Arrays.toString(array));
        bubbleSort(array);
        System.out.println("Bubble sorted array: " + Arrays.toString(array));
    }

    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int sortedNumber = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = sortedNumber;
                }
            }
        }
    }
}

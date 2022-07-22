package ru.masaviktoria.algorythms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = ArrayForSorting.createIntArray();
        System.out.println("Array: " + Arrays.toString(array));
        selectionSort(array);
        System.out.println("Selection sorted array: " + Arrays.toString(array));
    }

    private static void selectionSort(int[] array) {
        int sortedIndex = array.length - 1;
        for (int k = 0; k < array.length; k++) {
            int maxNumber = 0;
            int sortedNumberIndex = 0;
            for (int i = 0; i <= sortedIndex; i++) {
                int sortedNumber = array[i];
                if (sortedNumber > maxNumber) {
                    maxNumber = sortedNumber;
                    sortedNumberIndex = i;
                }
            }
            if (array[sortedIndex] < maxNumber) {
                array[sortedNumberIndex] = array[sortedIndex];
                array[sortedIndex] = maxNumber;
            }
            sortedIndex--;
        }
    }
}

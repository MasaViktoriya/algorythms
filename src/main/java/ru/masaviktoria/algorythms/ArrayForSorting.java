package ru.masaviktoria.algorythms;

public class ArrayForSorting {
    static  int[] createIntArray() {
        int[] array = new int[(int) (Math.random() * 100)];
        for (int i = 0; i < array.length; i++) {
            int value = ((int) (Math.random() * 100));
            array[i] = value;
        }
        return array;
    }
}

package ru.masaviktoria.algorythms;

import java.util.Arrays;

public class RecursionMaxElement {
    public static void main(String[] args) {
        int[] array = ArrayForSorting.createIntArray();
        System.out.println("Array: " + Arrays.toString(array));
        try {
            System.out.println("Max number in array : " + maxElement(array));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static int maxElement(int[] array) throws Exception {
        if (array.length == 0){
            throw new Exception("Array is empty");
        } else if (array.length == 1) {
            return array[0];
        } else if (array.length == 2) {
            if (array[0] > array[1]){
                return array[0];
            } else {
                return array[1];
            }
        } else {
            int[] restOfArray = Arrays.copyOfRange(array, 1, array.length);
            int submax = maxElement(restOfArray);
            if (array[0] > submax){
                return array[0];
            } else{
                return submax;
            }
        }
    }
}

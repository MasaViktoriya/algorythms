package ru.masaviktoria.algorythms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecursionElementsCount {
    public static void main(String[] args) {
        ArrayList<String> wordlist = new ArrayList<>();
        wordlist.add("port");
        wordlist.add("nord");
        wordlist.add("sort");
        System.out.println("Count of elements in list " + wordlist + ": " + elementsCount(wordlist));

        int[] array = ArrayForSorting.createIntArray();
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Count of numbers in array : " + elementsCount(array));
    }

    private static int elementsCount(int[] array) {
        if (array.length == 0) {
            return 0;
        } else if (array.length ==1){
            return 1;
        } else {
            int[] restOfArray = Arrays.copyOfRange(array, 1, array.length);
            return 1 + elementsCount(restOfArray);
        }
    }

    private static int elementsCount(ArrayList<String> wordlist) {
        if (wordlist.isEmpty()){
            return  0;
        } else if (wordlist.size() ==1){
            return  1;
        } else {
           List<String> restOfWordlistArr = wordlist.stream().skip(1).toList();
           ArrayList<String> restOfWordlist = new ArrayList<>(restOfWordlistArr);
            return 1 + elementsCount(restOfWordlist);
        }
    }
}

package ru.masaviktoria.datastructures;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class StackCheck {
    public static void main(String[] args) {
        Stack<String> cards = new Stack<>();
        cards.push("Jack of spades");
        cards.push("King of spades");
        cards.push("Queen of spades");
        System.out.println("Cards: " + cards.getList());
        System.out.println("See upper card: " + cards.peek());
        System.out.println("Push ace of spades to the cards");
        cards.push("Ace of spades");
        System.out.println("See upper card: " + cards.peek());
        System.out.println("Return upper and remove it: " + cards.pop());
        System.out.println("Cards: " + cards.getList());

        Stack<Integer> numbers = new Stack<>();

        System.out.println("Empty Integer stack: " + numbers.getList());
        try {
            System.out.println("See upper: " + numbers.peek());
            System.out.println("Return upper and remove it: " + numbers.pop());
        } catch (EmptyStackException e){
            System.out.println("The stack is empty, operation impossible");
        }


        Stack<Double> doubles = new Stack<>();
        doubles.push(4.0);
        doubles.push(5.9);
        doubles.push(127.1);
        System.out.println("Doubles stack: " + doubles.getList());
        System.out.println("See upper: " + doubles.peek());
        System.out.println("Return upper and remove it: " + doubles.pop());
        System.out.println("Doubles stack: " + doubles.getList());
        System.out.println("Clear stack");
        doubles.clear();
        System.out.println("Doubles stack: " + doubles.getList());

        ArrayList<String> wordlist = new ArrayList<>();
        wordlist.add("port");
        wordlist.add("nord");
        wordlist.add("sort");
        Stack<String> words = new Stack<>(wordlist);
        System.out.println("Words stack: " + words.getList());
        System.out.println("See upper word: " + words.peek());
    }


}

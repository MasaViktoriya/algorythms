package ru.masaviktoria.datastructures;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class StackCheck {
    public static void main(String[] args) {
        Stack<String> cards = new Stack<>();
        cards.push("Валет пик");
        cards.push("Король пик");
        cards.push("Дама пик");
        System.out.println("Колода: " + cards.getList());
        System.out.println("Верхняя карта (подсмотреть): " + cards.peek());
        System.out.println("Положили в колоду туза пик");
        cards.push("Туз пик");
        System.out.println("Верхняя карта (подсмотреть): " + cards.peek());
        System.out.println("Забрать из колоды верхнюю карту: " + cards.pop());
        System.out.println("Колода: " + cards.getList());

        Stack<Integer> numbers = new Stack<>();

        System.out.println("Пустой стек чисел: " + numbers.getList());
        try {
            System.out.println("Подсмотреть: " + numbers.peek());
            System.out.println("извлечь верхнее число и удалить: " + numbers.pop());
        } catch (EmptyStackException e){
            System.out.println("Стек пуст, операции выполнить невозможно");
        }


        Stack<Double> doubles = new Stack<Double>();
        doubles.push(4.0);
        doubles.push(5.9);
        doubles.push(127.1);
        System.out.println("Стек даблов: " + doubles.getList());
        System.out.println("Подсмотреть верхний: " + doubles.peek());
        System.out.println("Забрать верхний и удалить: " + doubles.pop());
        System.out.println("Стек даблов: " + doubles.getList());
        System.out.println("Очистить стек");
        doubles.clear();
        System.out.println("Стек даблов: " + doubles.getList());

        ArrayList<String> wordlist = new ArrayList<>();
        wordlist.add("port");
        wordlist.add("nord");
        wordlist.add("sort");
        Stack<String> words = new Stack<String>(wordlist);
        System.out.println("Стек слов: " + words.getList());
        System.out.println("Подглядеть верхнее слово: " + words.peek());
    }


}

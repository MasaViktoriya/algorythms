package ru.masaviktoria.algorythms;

import ru.masaviktoria.datastructures.Stack;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CommonParenthesesValidation {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[^\\(\\)]");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите скобочную последовательность из обычных скобок");
        String parenthesesLine = scanner.nextLine();
        if(!pattern.matcher(parenthesesLine).find()) {
            if (validate(parenthesesLine)) {
                System.out.println("Последовательность верна");
            } else {
                System.out.println("Последовательность не верна");
            }
        }else {
            System.out.println("Введено некорректное выражение");
        }
    }

    private static boolean validate(String parenthesesLine) {
        Stack<Character> stack = new Stack<>();
        char[] parenthesesCharArray = parenthesesLine.toCharArray();
        char openingParentheses = '(';
        for (char parenthesis : parenthesesCharArray) {
            if (stack.getList().isEmpty()) {
                if (parenthesis != openingParentheses) {
                    return false;
                } else {
                    stack.push(parenthesis);
                }
            } else {
                if (stack.peek() != parenthesis) {
                    stack.pop();
                } else {
                    stack.push(parenthesis);
                }
            }
        }
        return stack.getList().isEmpty();
    }
}

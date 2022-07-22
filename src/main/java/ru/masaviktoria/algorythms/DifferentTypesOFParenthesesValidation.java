package ru.masaviktoria.algorythms;

import ru.masaviktoria.datastructures.Stack;

import java.util.Scanner;
import java.util.regex.Pattern;

public class DifferentTypesOFParenthesesValidation {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[^\\(\\)\\[\\]\\{\\}]");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите скобочную последовательность из скобок вида (), [], {}");
        String parenthesesLine = scanner.nextLine();
        if (!pattern.matcher(parenthesesLine).find() && !parenthesesLine.isEmpty()) {
            if (validate(parenthesesLine)) {
                System.out.println("Последовательность верна");
            } else {
                System.out.println("Последовательность не верна");
            }
        } else {
            System.out.println("Введено некорректное выражение");
        }
    }

    private static boolean validate(String parenthesesLine) {
        Stack<String> stack = new Stack<>();
        String[] parenthesesArray = parenthesesLine.split("");
        Pattern openingPattern = Pattern.compile("[\\(\\[\\{]");
        for (String parenthesis : parenthesesArray) {
            if (stack.getList().isEmpty()) {
                if (!openingPattern.matcher(parenthesis).find()) {
                    return false;
                } else {
                    stack.push(parenthesis);
                }
            } else {
                String last = stack.peek();
                switch (last) {
                    case "(":
                        if (parenthesis.equals(")")) {
                            stack.pop();
                        } else {
                            stack.push(parenthesis);
                        }
                        break;
                    case "[":
                        if (parenthesis.equals("]")) {
                            stack.pop();
                        } else {
                            stack.push(parenthesis);
                        }
                        break;
                    case "{":
                        if (parenthesis.equals("}")) {
                            stack.pop();
                        } else {
                            stack.push(parenthesis);
                        }
                        break;
                }
            }
        }
        return stack.getList().isEmpty();
    }
}

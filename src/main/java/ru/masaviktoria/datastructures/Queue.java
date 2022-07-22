package ru.masaviktoria.datastructures;

import java.util.ArrayList;

public class Queue<T> {
    private Stack<T> stack1 = new Stack<>();
    private Stack<T> stack2 = new Stack<>();

    public ArrayList<T> getQueue() {
        ArrayList<T> queueList = new ArrayList<>();
        queueList.addAll(stack1.getList());
        queueList.addAll(stack2.getList());
        return queueList;
    }

    public int size() {
        return stack1.size() + stack2.size();
    }

    public void push(T value) {
        stack1.push(value);
    }

    public T peek() {
        return stack1.peek();
    }

    public T pop() {
        if (stack2.getList().isEmpty()) {
            int valuesNumber = stack1.size();
            for (int i = 0; i < valuesNumber; i++) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public T front() {
        if (stack2.getList().isEmpty()) {
            int valuesNumber = stack1.size();
            for (int i = 0; i < valuesNumber; i++) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public void clear() {
        stack1.clear();
        stack2.clear();
    }
}

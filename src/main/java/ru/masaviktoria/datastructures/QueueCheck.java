package ru.masaviktoria.datastructures;

public class QueueCheck {
    public static void main(String[] args) {
        Queue<String> que1 = new Queue<>();
        que1.push("aaa");
        que1.push("bbb");
        que1.push("cccc");
        que1.push("dd");
        que1.push("eee");
        System.out.println("Queue check: "+ que1.getQueue());
        System.out.println("Queue size: " + que1.size());
        System.out.println("See last added element: "+ que1.peek());
        System.out.println("See first added element: "+ que1.front());
        System.out.println("Queue check: "+ que1.getQueue());
        System.out.println("Remove first added element: "+ que1.pop());
        System.out.println("Queue check: "+ que1.getQueue());
        que1.clear();
        System.out.println("Queue cleared");
        System.out.println("Queue check: "+ que1.getQueue());

        Queue<Stack<Integer>> que2 =  new Queue<>();
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack2.push(4);
        stack2.push(5);
        stack2.push(6);
        stack3.push(7);
        stack3.push(8);
        stack3.push(9);
        que2.push(stack1);
        que2.push(stack2);
        que2.push(stack3);
        System.out.println("Queue check: " + que2.getQueue());
        System.out.println("See last added element: " + que2.peek());
        System.out.println("See first added element: " + que2.front());
        System.out.println("Remove first added element: " + que2.pop());
        System.out.println("Queue check: " + que2.getQueue());
    }
}

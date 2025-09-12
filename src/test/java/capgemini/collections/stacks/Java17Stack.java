package capgemini.collections.stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class Java17Stack {

    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();

        // Push
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Peek
        System.out.println("Top element: " + stack.peek()); // 30

        // Pop
        System.out.println("Popped: " + stack.pop()); // 30
        System.out.println("Popped: " + stack.pop()); // 20
    }

}

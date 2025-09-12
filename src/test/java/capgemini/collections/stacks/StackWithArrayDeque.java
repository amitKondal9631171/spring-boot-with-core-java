package capgemini.collections.stacks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class StackWithArrayDeque {

    /**
     * ArrayDeque Works
     *     Internally: uses a resizable circular array (like a ring buffer).
     *     Operations are O(1) for adding/removing at both ends.
     *     Provides methods to work at front and rear.
     *
     *     Iteration is done sequentially over the backing array, skipping nulls.
     *     O(n) for iterating n elements
     * @param args
     */
    public static void main(String[] args) {

        Deque<String> stack = new ArrayDeque<>();

        // Push (LIFO add)
        stack.push("A");
        stack.push("B");
        stack.push("C");

        // Peek (top element)
        System.out.println("Top: " + stack.peek()); // C

        // Pop (LIFO remove)
        System.out.println("Popped: " + stack.pop()); // C
        System.out.println("Popped: " + stack.pop()); // B
        System.out.println("Remaining Stack: " + stack); // [A]
    }
}

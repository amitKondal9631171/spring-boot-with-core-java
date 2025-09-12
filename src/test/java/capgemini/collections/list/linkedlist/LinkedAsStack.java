package capgemini.collections.list.linkedlist;

import java.util.Deque;
import java.util.LinkedList;


/**
 * Demonstrates stack implementation using LinkedList
 * Stack follows LIFO (Last In First Out) principle
 */

public class LinkedAsStack {

    public static void main(String[] args) {

        // Create a stack using LinkedList
        Deque<Integer> stack = new LinkedList<>();

        // Push elements onto the stack
        System.out.println("Pushing elements onto stack:");
        push(stack, 10);
        push(stack, 20);
        push(stack, 30);
        System.out.println("Current stack: " + stack);

        // Peek at the top element
        System.out.println("\nTop element: " + peek(stack));

        // Pop elements from the stack
        System.out.println("\nPopping elements from stack:");
        while (!isEmpty(stack)) {
            System.out.println("Popped: " + pop(stack));
            System.out.println("Current stack: " + stack);
        }

        // Try to pop from empty stack
        System.out.println("\nAttempting to pop from empty stack:");
        System.out.println("Popped: " + pop(stack));
    }

    /**
     * Push an element onto the stack
     * @param stack The stack
     * @param element The element to push
     */
    public static <T> void push(Deque<T> stack, T element) {
        stack.push(element); // Adds to the beginning of the list
    }

    /**
     * Pop an element from the stack
     * @param stack The stack
     * @return The popped element
     * @throws java.util.NoSuchElementException if stack is empty
     */
    public static <T> T pop(Deque<T> stack) {
        if (isEmpty(stack)) {
            System.out.print("Stack is empty! ");
            return null;
        }
        return stack.pop(); // Removes and returns the first element
    }

    /**
     * Peek at the top element without removing it
     * @param stack The stack
     * @return The top element
     */
    public static <T> T peek(Deque<T> stack) {
        if (isEmpty(stack)) {
            System.out.print("Stack is empty! ");
            return null;
        }
        return stack.peek(); // Returns the first element without removing it
    }

    /**
     * Check if stack is empty
     * @param stack The stack
     * @return true if stack is empty, false otherwise
     */
    public static <T> boolean isEmpty(Deque<T> stack) {
        return stack.isEmpty();
    }
}
package capgemini.collections.queues;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueWithArrayDeque {

    /**
     * ArrayDeque Works
     *     Internally: uses a resizable circular array (like a ring buffer).
     *     Operations are O(1) for adding/removing at both ends.
     *     Provides methods to work at front and rear.
     * @param args
     */
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();

        // Enqueue
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");

        // Peek (front element)
        System.out.println("Front: " + queue.peek()); // A

        // Dequeue
        System.out.println("Removed: " + queue.poll()); // A
        System.out.println("Removed: " + queue.poll()); // B
        System.out.println("Remaining Queue: " + queue); // [C]
    }
}

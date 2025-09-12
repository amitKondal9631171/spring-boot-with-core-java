package capgemini.collections.list.linkedlist;
import java.util.LinkedList;
public class AsQueueStackAndLinkedList {

    public static void main(String[] args) {

        // --------------------------
        // 1️⃣ LinkedList as STACK (LIFO)
        // --------------------------
        System.out.println("=== LinkedList as STACK (LIFO) ===");
        LinkedList<String> stack = new LinkedList<>();

        // PUSH - add elements to top
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println("Stack after pushes: " + stack); // [C, B, A]

        // POP - remove from top
        String popped = stack.pop();
        System.out.println("Popped element: " + popped); // C
        System.out.println("Stack after pop: " + stack); // [B, A]

        // PEEK - view top without removing
        System.out.println("Peek top element: " + stack.peek()); // B


        // --------------------------
        // 2️⃣ LinkedList as QUEUE (FIFO)
        // --------------------------
        System.out.println("\n=== LinkedList as QUEUE (FIFO) ===");
        LinkedList<String> queue = new LinkedList<>();

        // ENQUEUE - add to tail
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        System.out.println("Queue after offers: " + queue); // [A, B, C]

        // DEQUEUE - remove from head
        String polled = queue.poll();
        System.out.println("Polled element: " + polled); // A
        System.out.println("Queue after poll: " + queue); // [B, C]

        // PEEK - view head without removing
        System.out.println("Peek head element: " + queue.peek()); // B


        // --------------------------
        // 3️⃣ LinkedList as NORMAL LIST
        // --------------------------
        System.out.println("\n=== LinkedList as NORMAL LIST ===");
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("List after additions: " + list); // [A, B, C]

        // Access by index
        System.out.println("Element at index 1: " + list.get(1)); // B

        // Remove specific element
        list.remove("B");
        System.out.println("List after removing B: " + list); // [A, C]

        // Iterate
        System.out.println("Iterating through list:");
        for (String item : list) {
            System.out.println(item);
        }
    }

}

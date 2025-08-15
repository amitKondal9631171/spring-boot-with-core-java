package techmahindra.dataStructure;

import java.util.*;

/**
 * Linked List are linear data structures where the elements are not stored in contiguous locations and every element is a
 * separate object with a data part and address part.The elements are linked using pointers and addresses. Each element is known as a node.
 * Due to the dynamicity and ease of insertions and deletions, they are preferred over the arrays.
 * It also has few disadvantages like the nodes cannot be accessed directly instead we need to start from the head and follow through the
 *      link to reach to a node we wish to access.
 *  Node means node object we can get the values but not node.
 */
public class CustomLinkedList {

    public static void main(String args[])
    {
        // Creating object of class linked list
        LinkedList<String> object = new LinkedList<String>();

        // Adding elements to the linked list
        object.add("A");
        object.add("B");
        object.addLast("C");
        object.addFirst("D");
        object.add(2, "E");
        object.add("F");
        object.add("G");
        System.out.println("At 2 : " + object.get(2));
        object.add(2, "AE");
        System.out.println("At 2 : " + object.get(2));
        System.out.println("At Peek : " + object.peek());
        System.out.println("At peekFirst : " + object.peekFirst());
        System.out.println("At peekLast : " + object.peekLast());
        System.out.println("Linked list : " + object);

        // Removing elements from the linked list
        object.remove("B");
        object.remove(3);
        object.removeFirst();
        object.removeLast();
        System.out.println("Linked list after deletion: " + object);

        // Finding elements in the linked list
        boolean status = object.contains("E");

        if(status)
            System.out.println("List contains the element 'E' as it is removed");
        else
            System.out.println("List doesn't contain the element 'E'");

        // Number of elements in the linked list
        int size = object.size();
        System.out.println("Size of linked list = " + size);

        // Get and set elements from linked list
        Object element = object.get(2);
        System.out.println("Element returned by get() : " + element);
        object.set(2, "Y");
        System.out.println("Linked list after change : " + object);
    }
}

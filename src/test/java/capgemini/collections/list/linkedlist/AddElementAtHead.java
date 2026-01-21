package capgemini.collections.list.linkedlist;

import java.util.LinkedList;

public class AddElementAtHead {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        //Adding elements at the end of the list
        //difference between add and addLast
        //addLast adds the element at the end of the list
        //add adds the element at the beginning of the list
        //offerLast adds the element at the end of the list
        //offer adds the element at the beginning of the list

        list.add(10); //Adding elements at the end of the list
        list.addLast(20);//Adding elements at the end of the list
        list.offer(30);//Adding elements at the end of the list
        list.offerLast(40);//Adding elements at the end of the list
        System.out.println(list);

        //Adding elements at the beginning of the list
        list.offerFirst(1);
        list.addFirst(2);
        //Printing the elements of list
        System.out.println(list);     //Output : [2, 1, 10, 20, 30, 40]

    }
}
/**
 * The multiple add methods in LinkedList serve different purposes and come from different interfaces that LinkedList implements. Here's why they exist:
 * Different Interfaces, Similar Functionality
     * add(), addFirst(), addLast() come from the Deque interface
     * offer(), offerFirst(), offerLast() come from the Queue interface
 * They provide the same functionality but are named differently for interface compatibility

 * Behavior on Failure
 *  add() methods throw an exception if the operation fails (e.g., capacity restrictions)
 *  offer() methods return false if the operation fails (more queue-like behavior)
 * Naming Conventions
 *  addXxx() follows List/Collection interface naming
 *  offerXxx() follows Queue interface naming
 * Both sets exist to maintain consistency with their respective interfaces

 * Common Use Cases
 *  Use add()/addLast() when working with LinkedList as a List
 *  Use offer()/offerLast() when using LinkedList as a Queue
 *  Use push()/pop() when using LinkedList as a Stack
 */
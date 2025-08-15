package capgemini.collections.list.linkedlist;

import java.util.LinkedList;

/**
 * LinkedList has default capability to work as stack because of push method by default.
 * Push method adds the element at the first location always.
 */
public class LinkedAsStack {

    public static void main(String[] args) {

        LinkedList<Integer> stack = new LinkedList<Integer>();

        //pushing the elements into the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        //Printing the elements of stack
        System.out.println(stack);      //Output : [40, 30, 20, 10]

        //Poping out the elements from the stack
        System.out.println(stack.pop());    //Output : return 40 and removed from list
        System.out.println(stack.pop());    //Output : return 30 and removed from list

        System.out.println(stack.peek());   //return last element
        System.out.println(stack);
    }
}

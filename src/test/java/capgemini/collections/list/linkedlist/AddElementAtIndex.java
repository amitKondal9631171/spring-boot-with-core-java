package capgemini.collections.list.linkedlist;

import java.util.LinkedList;

public class AddElementAtIndex {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        //Adding elements at the end of the list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        //Printing the elements of list
        System.out.println(list);      //Output : [10, 20, 30, 40]

        //Adding an element at index 2 with time complexity of O(1)
        //Adding an element at index 2 with time complexity of O(n) in case of ArrayList and LinkedList is O(1).
        // why ? Because we need to shift the elements to the right of index 2 to make space for the new element and that will take O(n) time complexity in case of ArrayList.
        list.add(2, 9999);

        System.out.println(String.valueOf(list));
    }
}

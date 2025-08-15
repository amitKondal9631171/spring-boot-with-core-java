package capgemini.collections.list.linkedlist;

import java.util.LinkedList;

public class CloneLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        //add the elements into the stack
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);

        LinkedList<Integer> linkedList2 = (LinkedList) linkedList.clone();
        linkedList2.add(50);

        System.out.println("linkedList: "+linkedList);
        System.out.println("linkedList2: "+linkedList2);
    }
}

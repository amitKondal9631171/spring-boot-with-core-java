package capgemini.collections.list.linkedlist;

import java.util.Objects;

public class CustomLinkedList {

    private Node head;
    private Node lastNode;

    static class Node{

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    void add(int value){

        Node new_node = new Node(value);
        if (head == null) {
            head = new_node;
          //  System.out.println(head);
        }else {
           // System.out.println(head);
            lastNode.next = new_node;
        }

        lastNode = new_node; // just reference to the last node.
    }

    void printList(){

        Node node = head;
        while (Objects.nonNull(node)) {
            // Print the data at current node
            System.out.print(node.data + " ");
            // Go to next node
            node = node.next;
        }

    }

    void printListRecursively(){
        if(head == null)
            return;
        System.out.println(head.data);
        head = head.next;
        printListRecursively();

    }


}

package capgemini.collections.queues;

import java.util.PriorityQueue;
import java.util.Queue;

/*
    What is Heap?
    A heap is a tree-based data structure that forms a complete binary tree,
    and satisfies the heap property. If A is a parent node of B, then A is ordered with
    respect to the node B for all nodes A and B in a heap. It means that the value of the
    parent node could be more than or equal to the value of the child node, or the value of
    the parent node could be less than or equal to the value of the child node.
 */

/*
The following are the applications of the priority queue:
    It is used in the Dijkstra's shortest path algorithm.
    It is used in prim's algorithm
    It is used in data compression techniques like Huffman code.
    It is used in heap sort.
    It is also used in operating system like priority scheduling, load balancing and interrupt handling.
 */

public class PriorityQues {

    /*
        It internally uses the comparable by default
        poll(): This function will remove the highest priority element from the priority queue.
        add(2): This function will insert '2' element in a priority queue.
        The priority queue can be implemented in four ways that include arrays, linked list,
                     heap data structure and binary search tree.
     */

    public static void main(String[] args) {
        /*
             * Here, we have created a priority queue without any arguments. In this case,
             * the head of the priority queue is the smallest element of the queue.
             * And elements are removed in ascending order from the queue.
         */
        // Creating a priority queue by passing comparator
        Queue<Integer> numbers1 = new PriorityQueue<>( );
        numbers1.add(4);
        numbers1.add(1);
        numbers1.add(6);
        numbers1.add(2);

        for(int value : numbers1){
            System.out.println("Queue elements: " + value);
        }

    }
}

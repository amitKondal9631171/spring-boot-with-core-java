package capgemini.collections.stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueUsingStacks {

    static Deque<Integer> stack1 = new ArrayDeque<>();
    static Deque<Integer> stack2 = new ArrayDeque<>();

    void enQueue(int x){

        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }

        stack1.push(x);

        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }

    }

    int deQueue(){
        return stack1.pop();
    }

    public static void main(String[] args) {

        QueueUsingStacks  queue = new QueueUsingStacks();
        queue.enQueue(11);
        queue.enQueue(2);
        queue.enQueue(12);
        queue.enQueue(23);

        System.out.println(queue.deQueue());  //  11
        System.out.println(stack1.getLast()); //  23
    }

}

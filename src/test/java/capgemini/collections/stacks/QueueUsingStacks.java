package capgemini.collections.stacks;

import java.util.Stack;

public class QueueUsingStacks {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    void enQueue(int x){

        while(!stack1.empty()){
            stack2.push(stack1.pop());
        }

        stack1.push(x);

        while(!stack2.empty()){
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

        System.out.println(queue.deQueue());  // 11
    }

}

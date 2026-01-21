package capgemini.collections.stacks;

import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class SortStack {

    public static void main(String[] args) {

        usingStreamsIncreasing();
        usingStreamsDecreasing();
        customLogic();

    }

    private static void usingStreamsIncreasing() {
        Stack<Integer> input = new Stack<Integer>(); //LIFO
        input.add(34);
        input.add(3);
        input.add(31);
        input.add(98);
        input.add(92);
        input.add(23);

        List<Integer> sortedStack = input.stream().sorted().toList();

        System.out.println("Using Streams"+ sortedStack);
    }

    private static void usingStreamsDecreasing() {
        Stack<Integer> input = new Stack<Integer>(); //LIFO
        input.add(34);
        input.add(3);
        input.add(31);
        input.add(98);
        input.add(92);
        input.add(23);

        List<Integer> sortedStack = input.stream().sorted(Comparator.reverseOrder()).toList();

        System.out.println("Using Streams"+ sortedStack);
    }

    private static void customLogic() {
        Stack<Integer> input = new Stack<Integer>(); //LIFO
        input.add(34);
        input.add(3);
        input.add(31);
        input.add(98);
        input.add(92);
        input.add(23);

        Stack<Integer> sortedStack = new Stack<Integer>();
        while(! input.empty()){

            int value = input.pop();
            //move all elements greater than value back to main stack
            while(!sortedStack.empty() && value > sortedStack.peek()){
                input.push(sortedStack.pop());
            }
            //keep the smallest value in temp stack
            sortedStack.push(value); // add largest value first
        }

        while (!sortedStack.empty())
        {
            System.out.print(sortedStack.pop()+" ");
        }
    }

}
/**
 * Legacy Stack<E> Class
 * Java provides a built-in java.util.Stack, which is a subclass of Vector.
 * But it’s legacy, not recommended for new code because it’s synchronized and slower.
 */
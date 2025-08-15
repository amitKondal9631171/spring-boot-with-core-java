package capgemini.collections;

import java.util.Stack;

public class StackCollection {

    public static void main(String[] args) {

        Stack<String> stackObjects = new Stack<>();
        stackObjects.push("Amit");
        String value = stackObjects.pop(); // will return last element & then will remove it.
        System.out.println(value);
        System.out.println("Stack size: "+ stackObjects.size());

        stackObjects.push("Amit kondal");
        value = stackObjects.peek(); // will return the last element and will not remove it.
        System.out.println(value);
        System.out.println("Stack size: "+ stackObjects.size());
    }

}

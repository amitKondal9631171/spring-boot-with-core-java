package capgemini.collections.stacks;

import java.util.Stack;

public class ReverseString {


    public static void main(String[] args) {
        String input = "AmitimAm";
        Stack<Character> stack = new Stack<>();
        for(Character character : input.toCharArray()){
            stack.push(character);
        }
        StringBuilder builder = new StringBuilder(input.length());

        while(!stack.empty()){
            builder.append(stack.pop());
        }

        System.out.println("Is Palindrome: "+builder.toString().equals(input));

    }
}

package capgemini.collections.stacks;

import java.util.Stack;

public class ReverseEveryWord {

    public static void main(String[] args) {

        String input = "Amit Kondal ";

        Stack<Character> stack = new Stack<>();

        for (int i=0; i < input.length(); i++){
            if(input.charAt(i) != ' '){
                stack.push(input.charAt(i)); // add till no space found
            }else{
                while (!stack.empty()){
                    System.out.print(stack.pop()); // space found so print the elements now.
                }
                System.out.print(" ");
            }
        }
        // Since there may not be space after
        // last word.
        while (!stack.empty()) {
            System.out.print(stack.pop());
        }
    }
}

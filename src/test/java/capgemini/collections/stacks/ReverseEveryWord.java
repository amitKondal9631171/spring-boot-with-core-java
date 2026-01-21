package capgemini.collections.stacks;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Collectors;

public class ReverseEveryWord {

    public static void main(String[] args) {

        usingStreams();

        customLogic();

    }

    private static void usingStreams(){

        String sentence = "Java Streams make code elegant";

        String updatedString = Arrays.stream(sentence.split(" "))
                 .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));

        System.out.println(updatedString);


    }
    private static void customLogic() {
        String input = "Amit Kondal ";

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') { //checking character that is not space
                stack.push(input.charAt(i)); // add till no space found
            } else {
                while (!stack.empty()) {
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

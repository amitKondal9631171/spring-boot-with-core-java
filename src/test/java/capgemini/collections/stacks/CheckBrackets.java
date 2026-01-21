package capgemini.collections.stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class CheckBrackets {

    /**
     * If opened brackets are not closed then it is a not balanced brackets
     */
    public static void main(String[] args) {

        String input = "[{()}]";

        Deque<Character> stack = new ArrayDeque<>();

        boolean balancedOrNot = false;

        char[] brackets = input.toCharArray();

        for(char x : brackets){

            if (x == '(' || x == '[' || x == '{') {
                stack.push(x);
                continue;
            }

            char check = stack.pop();
            switch (x) {
                case ')':
                    balancedOrNot = (check == '(');
                    break;

                case '}':
                    balancedOrNot = (check == '{');
                    break;

                case ']':
                    balancedOrNot = (check == '[');
                    break;
            }
        }

        if(stack.size() > 0)
            balancedOrNot = false;

        String response = balancedOrNot ? "Balanced" : "Not Balanced";

        System.out.println(response);

    }
}

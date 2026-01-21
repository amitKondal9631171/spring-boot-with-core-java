package techmahindra.StringManipulation;

import java.util.Date;

/**
 * Created by HP-USER on 04-06-2019.
 */
public class ReverseString {

    private static void withSplitFunction(){
        System.out.println("withSplitFunction time:" + System.currentTimeMillis());
        String str = "Automation Testing Needs Knowledge of Selenium";
        String[] token = str.split("");
        for(int i= token.length-1; i>=0; i--) {
            System.out.print(token[i]);
        }
        System.out.println();
        System.out.println("End time:" + System.currentTimeMillis());
    }
    private static void withInbuildFunction(){
        System.out.println("\nwithInbuildFunction time:" + System.currentTimeMillis());
        String str = "Automation Testing Needs Knowledge of Selenium";
        StringBuilder str2 = new StringBuilder(str);
        str2 = str2.reverse();
        System.out.println(str2);
        System.out.println("End time:" + System.currentTimeMillis());
    }

    private static void FinalReverseWithoutUsingInbuiltFunction(){
        System.out.println("\nFinalReverseWithoutUsingInbuiltFunction time:" + System.currentTimeMillis());
        String str = "Automation Testing Needs Knowledge of Selenium";
        char chars[] = str.toCharArray();
        for(int i= chars.length-1; i>=0; i--) {
            System.out.print(chars[i]);
        }
        System.out.println("End time:" + System.currentTimeMillis());
    }

    /**
     * Step-by-step trace (example: "abcd")
     *
     * Call stack (top is current call):
     *
     *   reverseUsingRecursion("abcd")
     *      not base case → compute reverseUsingRecursion("bcd") + 'a'
         reverseUsingRecursion("bcd")
            not base case → compute reverseUsingRecursion("cd") + 'b'
         reverseUsingRecursion("cd")
            not base case → compute reverseUsingRecursion("d") + 'c'
         reverseUsingRecursion("d")
            base case (length == 1) → returns "d"

      Now unwind (return values flow back up):
     * Frame 3 receives "d", computes "d" + 'c' → returns "dc".
     * Frame 2 receives "dc", computes "dc" + 'b' → returns "dcb".
     * Frame 1 receives "dcb", computes "dcb" + 'a' → returns "dcba".

     * Final returned value: "dcba".

     */
    private static String reverseUsingRecursion(String inputString){

        if ((null == inputString) || (inputString.length() <= 1))
        {
            return inputString;
        }
        return reverseUsingRecursion(inputString.substring(1)) + inputString.charAt(0);
    }

    public static void main(String[] args) {
        withSplitFunction();
        withInbuildFunction();
        FinalReverseWithoutUsingInbuiltFunction();
        System.out.println("\nReverseUsingRecursion time:" + System.currentTimeMillis());
         String reversedString = reverseUsingRecursion("Amit kondal");
        System.out.println(reversedString);
        System.out.println("End time:" + System.currentTimeMillis());

     }
}

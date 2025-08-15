package techmahindra.StringManipulation;

import java.util.Date;

/**
 * Created by HP-USER on 04-06-2019.
 */
public class ReverseString {

    private static void withSplitFunction(){
        System.out.println("withSplitFunction time:" + System.currentTimeMillis());
        String str = "Automation Automation Automation Automation Automation";
        String[] token = str.split("");
        for(int i= token.length-1; i>=0; i--) {
            System.out.print(token[i]);
        }
        System.out.println();
        System.out.println("End time:" + System.currentTimeMillis());
    }
    private static void withInbuildFunction(){
        System.out.println("\nwithInbuildFunction time:" + System.currentTimeMillis());
        String str = "Automation Automation Automation Automation Automation";
        StringBuilder str2 = new StringBuilder(str);
        str2 = str2.reverse();
        System.out.println(str2);
        System.out.println("End time:" + System.currentTimeMillis());
    }

    private static void FinalReverseWithoutUsingInbuiltFunction(){
        System.out.println("\nFinalReverseWithoutUsingInbuiltFunction time:" + System.currentTimeMillis());
        String str = "Automation Automation Automation Automation Automation";
        char chars[] = str.toCharArray();
        for(int i= chars.length-1; i>=0; i--) {
            System.out.print(chars[i]);
        }
        System.out.println("End time:" + System.currentTimeMillis());
    }

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

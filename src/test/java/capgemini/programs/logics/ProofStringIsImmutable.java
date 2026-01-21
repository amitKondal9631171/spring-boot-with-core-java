package capgemini.programs.logics;

import java.util.ArrayList;
import java.util.List;

public class ProofStringIsImmutable {

    /**
     * This appends a string ” base” to str. But wait, how is this possible,
     * since String objects are immutable? Well to your surprise, it is.
     *
     * When the above statement is executed, the VM takes the value of String str,
     * i.e. “knowledge” and appends ” base”, giving us the value “knowledge base”.
     * Now, since Strings are immutable, the VM can’t assign this value to str,
     * so it creates a new String object, gives it a value “knowledge base”,
     * and gives it reference str.
     *
     */

    public static void main(String[] args) {

        /**
         * String is mutable means whenever we are updating the reference
         * It is creating new object
         */
        String firstString = "Amit";
        String secondString = firstString;
        firstString = firstString.concat(" Kondal");
        System.out.println(firstString);
        System.out.println(secondString);

        String firstStr = new String("Amit");
        String secStr = firstStr;
        firstStr = firstStr.concat(" Kondal");
        System.out.println(firstStr);
        System.out.println(secStr);

        /**
         * List is mutable means whenever we are changing the value the reference is getting
         * updated.
         */
        List<String> firstList = new ArrayList<>();
        firstList.add("Amit");

        List<String> secondList = firstList;

        secondList.add(secondList.get(0).concat(" Kondal"));

        System.out.println(secondList);

        System.out.println(firstList);

    }

}

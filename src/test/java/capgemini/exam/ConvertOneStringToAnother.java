package capgemini.exam;

import java.util.Scanner;

public class ConvertOneStringToAnother {

    /*
        resultingString = "Amit"
        inputString="Kondal Amit"
     */
    static String convertOneToAnotherString(String resultingString, String inputString) {

            for(char inputChar : inputString.toCharArray()){

                int resultingIndex = resultingString.indexOf(inputChar);


            }

        return inputString;

    }

    /**
     * 1. Operations required to remove the extra characters
     * 2. Operations required to add the missing characters
     * 3. Operations required to rearrange the character locations
     */
    public static void main(String[] args) {

        Scanner inputScan = new Scanner(System.in);


        String firstSequence = "kitten"; //inputScan.next();
        String secondSequence = "nitgits"; //inputScan.next();
        //5
        int operations = 0;

        for (char characters : firstSequence.toCharArray()) {
            int index = secondSequence.indexOf(characters);
            if (index == -1) {
                firstSequence = firstSequence.replace(String.valueOf(characters), "");
                operations++; //operations to remove the extra characters from given string
            }
        }

        if (secondSequence.compareTo(firstSequence) > 0) {
            for (char character : secondSequence.toCharArray()) {
                int index = firstSequence.indexOf(character);
                if (index == -1) {
                    firstSequence = firstSequence.concat(String.valueOf(character));
                    operations++; // operations to add missing characters in given string
                }
            }
        }

        /**
         * If both string are already equal then stop further processing of rearranging the characters
         */
        if (firstSequence.equalsIgnoreCase(secondSequence)) {

            for (char character : firstSequence.toCharArray()) {
                int index = secondSequence.indexOf(character);

                if (index > 0) { // ==0 means both characters are on same index else rearrangement required

                    int char1 = firstSequence.indexOf(character);
                    //firstSequence = new String(swap(firstSequence, char1, index));
                    operations++; // operations required to rearrange the characters
                }
            }
        }
        System.out.println(firstSequence + " , " + operations);
    }
}

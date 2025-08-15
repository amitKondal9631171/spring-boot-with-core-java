package capgemini.programs.arrayz;

import java.util.Arrays;

public class FirstAndLastOccurrenceOfElement {

    public static void main(String[] args) {

        String[] inputArray = {"Amit", "Kondal", "Seema", "Kondal", "Seema", "Kondal"};

        String targetElement = "Kondal";

        int firstIndex=-1, lastIndex=-1;

        for (int i = 0; i < inputArray.length; i++) {

            String element = inputArray[i];

            if (targetElement.equalsIgnoreCase(element)) {

                if (lastIndex != -1) {
                    lastIndex = i;
                } else{
                    firstIndex = lastIndex = i;
                }

            }
        }

        System.out.println("First Index: "+ firstIndex + ", Last index: "+ lastIndex);
    }
}

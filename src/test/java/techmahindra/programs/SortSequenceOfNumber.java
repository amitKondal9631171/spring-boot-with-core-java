package techmahindra.programs;

import java.util.Arrays;
import java.util.Comparator;

public class SortSequenceOfNumber {

    public static void main(String[] args) {

        int value = 7689354;
        int digits =  value == 0 ? 1 : (int) Math.log10(value) + 1;
        System.out.println(digits); // 7

        Integer[] digitsArray = new Integer[digits];

        for(int i=0; i< digits; i++){
             digitsArray[i] = value % 10;
            value = value / 10;
        }

        System.out.println(Arrays.toString(digitsArray));

        Arrays.sort( digitsArray);
        int finalOutPut=0;
        for(int i=0; i< digits; i++){

            finalOutPut = 10 * finalOutPut + digitsArray[i];
        }

        System.out.println(finalOutPut);
    }
}

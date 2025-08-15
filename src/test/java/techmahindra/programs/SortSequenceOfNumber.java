package techmahindra.programs;

import java.util.Arrays;
import java.util.Comparator;

public class SortSequenceOfNumber {

    public static void main(String[] args) {

        int value = 7689354;
        /*int digitsInNumber=0;
        while(value > 0){
            digitsInNumber++;
            value = value / 10;
        }*/

        int digitsInNumberAsInput=7; // if give otherwise needs to calculate as above
        Integer[] digitsArray = new Integer[digitsInNumberAsInput];

        for(int i=0; i< digitsInNumberAsInput; i++){
             digitsArray[i] = value % 10;
            value = value / 10;
        }
        System.out.println(Arrays.toString(digitsArray));

        Comparator<Integer> rule = Integer::compare;
        Arrays.sort( digitsArray, rule);
        int finalOutPut=0;
        for(int i=0; i< digitsInNumberAsInput; i++){

            finalOutPut = 10 * finalOutPut + digitsArray[i];
        }

        System.out.println(finalOutPut);
    }
}

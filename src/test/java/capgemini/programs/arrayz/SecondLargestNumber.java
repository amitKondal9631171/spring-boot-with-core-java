package capgemini.programs.arrayz;

import java.util.Arrays;

public class SecondLargestNumber {


    public static void main(String[] args) {

        int[] array = {1, 2, 13, 4, 5};
        Arrays.sort(array);
        System.out.println("Second Largest Number: "+ array[array.length-2]);

        int[] arrayForCustomLogic = {13, 22, 13, 41, 9, 15, 18, 71, 100, 99, 101};
        int firstLargest = 0;
        int secondLargest = 0;
        for (int element : arrayForCustomLogic){

            if(element > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = element;
            }else if (element > secondLargest)
                secondLargest=element;

        }

        System.out.println( "Second Largest Number: " + secondLargest);
    }

}

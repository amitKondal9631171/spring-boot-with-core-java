package capgemini.programs.arrayz.sorting;

import java.util.Arrays;

public class SmallestAndHighestNumber {

    static void smallestAndHighestNumbers(int[] inputArray){

        //Initialize all the value with first value of input array.
        int smallest = inputArray[0], highest = inputArray[0], secondHighest=inputArray[0];

        for(int i = 0; i < inputArray.length; i++){

            if (inputArray[i] > highest){
                secondHighest = highest;
                highest = inputArray[i];
            }else if(inputArray[i] > secondHighest)
                secondHighest = inputArray[i];
            else if(inputArray[i] < smallest)
                smallest = inputArray[i];

        }

        System.out.println("Highest using iteration: " + highest);
        System.out.println("Second Highest using iteration: " + secondHighest);
        System.out.println("Minimum using iteration: " + smallest);


    }

    public static void main(String[] args) {

        int[] inputArray = {1, 2, 3, 4, -5, 13, 60, 7};
        smallestAndHighestNumbers(inputArray);

        System.out.println("Minimum Using streams: " + Arrays.stream(inputArray).min());
    }

}

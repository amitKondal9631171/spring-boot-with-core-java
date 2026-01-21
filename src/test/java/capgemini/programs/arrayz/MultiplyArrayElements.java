package capgemini.programs.arrayz;

import java.util.Arrays;

/**
 * Multiply array elements but not array index itself.
 * {10, 2, 3, 4, 5} = {120, 600, 400, 300, 240}
 */
public class MultiplyArrayElements {

    public static void main(String[] args) {

        int[] inputArray = {10,2,3,4,5};
        int[] resultArray = new int[inputArray.length];

        int arrayCounter = 0;

        while (arrayCounter < inputArray.length){

            int leftMultiplication = 0;
            int rightMultiplication = 0;

            leftMultiplication = leftMultiplication(inputArray, arrayCounter);
            rightMultiplication = rightMultiplication(inputArray, arrayCounter + 1);
            resultArray[arrayCounter] = leftMultiplication * rightMultiplication;

            arrayCounter++;

        }

        System.out.println(Arrays.toString(resultArray));
    }

    static int leftMultiplication(int[] inputArray, int end){
        int result = 1;
        for(int i = 0; i < end; i++){
            result *= inputArray[i];
        }
        return  result;
    }

    static int rightMultiplication(int[] inputArray, int start){
        int result = 1;
        for(int i = start ; i < inputArray.length; i++){
            result *= inputArray[i];
        }
        return  result;
    }
}
